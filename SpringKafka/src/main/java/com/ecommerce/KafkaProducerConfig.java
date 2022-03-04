package com.ecommerce;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.streams.kstream.Produced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaProducerConfig {
   @Bean
   public ProducerFactory<String, String> producerFactory() {
      Map<String, Object> configProps = new HashMap<>();
      configProps.put(Producer.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
      configProps.put(Producer.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
      configProps.put(Producer.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
      return new DefaultKafkaProducerFactory<>(configProps);
   }
   @Bean
   public KafkaTemplate<String, String> kafkaTemplate() {
      return new KafkaTemplate<>(producerFactory());
   }
}