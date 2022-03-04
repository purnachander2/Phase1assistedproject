package com.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ecommerce.controllers.KafkaTemplate;

@SpringBootApplication
public class SpringKafkaApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaApplication.class, args);
	}

    @KafkaListener(topics = "ecommerce", groupId = "group-id")
    public void listen(String message) {
       System.out.println("Received Message in group - group-id: " + message);
    }
   
}
