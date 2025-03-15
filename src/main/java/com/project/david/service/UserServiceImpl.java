package com.project.david.service;

import org.springframework.stereotype.Service;

import com.project.david.dao.UserRepository;
import com.project.david.entity.User;
import com.project.david.kafka.KafkaProducer;

@Service
public class UserServiceImpl {
	private final UserRepository userRepository;
	private final KafkaProducer kafkaProducer;
	
	public UserServiceImpl(UserRepository userRepository, KafkaProducer kafkaProducer) {
		super();
		this.userRepository = userRepository;
		this.kafkaProducer = kafkaProducer;
	}
	
	public User ceateUser(User user) {
		// 儲存 User 至資料庫
		User savedUser=userRepository.save(user);
		// 發佈 Kafka 事件通知 User 已建立
		kafkaProducer.sendUserCreatedEvent(savedUser);
		return savedUser;
	}
}
