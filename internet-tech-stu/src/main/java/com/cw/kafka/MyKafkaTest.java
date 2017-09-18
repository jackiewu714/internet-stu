/**
 * 
 */
package com.cw.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author WuLiangzhi
 *
 */
public class MyKafkaTest {
	
	private static final Logger logger = LoggerFactory.getLogger(MyKafkaTest.class);

	public static void main(String[] args) {
		logger.info("begin...");
		String topic = "topic_1";
		new MyKafkaProducer(topic).start();
		new MyKafkaConsumer(topic).start();
		new MyKafkaConsumer1(topic).start();
		logger.info("end...");
	}
	
}
