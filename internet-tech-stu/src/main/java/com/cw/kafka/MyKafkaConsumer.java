/**
 * 
 */
package com.cw.kafka;

import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author WuLiangzhi
 *
 */
public class MyKafkaConsumer extends Thread{

	private static final Logger logger = LoggerFactory.getLogger(MyKafkaConsumer.class);
	
	private String topic;
	
	public MyKafkaConsumer(String topic) {
		super();
		this.topic = topic;
	}
	
	public void run() {
		Consumer<String, String> consumer = createConsumer();
		consumer.subscribe(Arrays.asList(topic));
		while(true) {
			ConsumerRecords<String, String> records = consumer.poll(100);
			for(ConsumerRecord<String, String> record : records) {
				String msg = String.format("offset=%s, key=%s, value=%s", record.offset(), record.key(), record.value());
				logger.info(msg);
			}
			try {
				TimeUnit.SECONDS.sleep(10);
			} catch (InterruptedException e) {
				logger.error(e.getMessage(), e);
			}
		}
	}
	
	private KafkaConsumer<String, String> createConsumer() {
		Properties props = new Properties();
		props.put("bootstrap.servers", MyKafkaConstant.BROKER_LIST);
		props.put("group.id", "group1");
		props.put("enable.auto.commit", "true");
		props.put("auto.commit.interval.ms", "1000");
		props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		
		KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(props);
		return consumer;
	}
	
}
