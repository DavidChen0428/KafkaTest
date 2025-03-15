package com.project.david.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
	private static final Logger logger=LoggerFactory.getLogger(KafkaConsumer.class);
	
	@KafkaListener(topics="${app.topic.name}", groupId="group_id")
	public void consume(String message) {
		logger.info(String.format("接收到 Kafka 訊息:{}", message));
		// 如有需要，可將訊息反序列化並進行進一步處理
	}
}
