package com.project.david.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.david.entity.User;

@Component
public class KafkaProducer {
	private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);

	@Value("${app.topic.name}")
	private String topicName;

	private final KafkaTemplate<String, String> kafkaTemplate;

	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}

	public void sendUserCreatedEvent(User user) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			String userJson = objectMapper.writeValueAsString(user);
			kafkaTemplate.send(topicName, userJson);
			logger.info("已發送 User 事件:{} ", userJson);
		} catch (Exception e) {
			logger.error("發送訊息過程發生錯誤", e);
		}
	}
}
