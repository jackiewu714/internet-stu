/**
 * @Title: KafkaProducer.java
 * @Package com.cw.kafka
 * @Description: TODO
 * Copyright: Copyright (c) 2014 
 * Company:YY Inc
 * 
 * @author WuLiangzhi
 * @date Mar 30, 2017 3:07:29 PM
 * @version V1.0
 */

package com.cw.stu.internet.tech.kafka;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @ClassName: KafkaProducer
 * @Description: TODO
 * @author WuLiangzhi
 * @date Mar 30, 2017 3:07:29 PM
 * 
 */

public class MyKafkaProducer extends Thread {
	
	private static final Logger logger = LoggerFactory.getLogger(MyKafkaProducer.class);

	private String topic;

	public MyKafkaProducer(String topic) {
		super();
		this.topic = topic;
	}

	public void run() {
		Producer<String, String> producer = createProducer();
		int i=0;
		while(true) {
			producer.send(new ProducerRecord<String, String>(topic, "key_" + i, "message_卡夫卡" + i));
			i++;
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				logger.error(e.getMessage(), e);
			}
		}
		
	}

	private Producer<String, String> createProducer() {
		Properties props = new Properties();
		props.put("bootstrap.servers", "192.168.10.243:9092,192.168.10.243:9093,192.168.10.243:9094");
		props.put("acks", "all");
		props.put("retries", 0);
		props.put("batch.size", 16384);
		props.put("linger.ms", 1);
		props.put("buffer.memory", 33554432);
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

		return new KafkaProducer<String, String>(props);
	}
	
}
