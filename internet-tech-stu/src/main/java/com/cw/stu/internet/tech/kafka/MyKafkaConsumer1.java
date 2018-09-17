/**
 * 
 */
package com.cw.stu.internet.tech.kafka;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kafka.consumer.ConsumerConfig;
import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;
import kafka.message.MessageAndMetadata;
import kafka.serializer.StringDecoder;
import kafka.utils.VerifiableProperties;

/**
 * @author WuLiangzhi
 * 
 */
public class MyKafkaConsumer1 extends Thread {

	private static final Logger logger = LoggerFactory.getLogger(MyKafkaConsumer1.class);

	private String topic;

	private ConsumerConnector consumer;

	public MyKafkaConsumer1(String topic) {
		this.topic = topic;
	}

	private ConsumerConnector createConsumerConnector() {
		Properties props = new Properties();
		// zookeeper 配置
		props.put("zookeeper.connect", MyKafkaConstant.ZOOKEEPER_LIST);

		// group 代表一个消费组
		props.put("group.id", "group2");

		// zk连接超时
		props.put("zookeeper.session.timeout.ms", "4000");
		props.put("zookeeper.sync.time.ms", "200");
		props.put("auto.commit.interval.ms", "1000");
		props.put("auto.offset.reset", "smallest");
		// 序列化类
		props.put("serializer.class", "kafka.serializer.StringEncoder");

		ConsumerConfig config = new ConsumerConfig(props);

		return kafka.consumer.Consumer.createJavaConsumerConnector(config);
	}

	public void run() {
		consumer = createConsumerConnector();
		Map<String, Integer> topicCountMap = new HashMap<String, Integer>();
		topicCountMap.put(topic, new Integer(1));

		StringDecoder keyDecoder = new StringDecoder(new VerifiableProperties());
		StringDecoder valueDecoder = new StringDecoder(new VerifiableProperties());

		Map<String, List<KafkaStream<String, String>>> consumerMap = consumer.createMessageStreams(topicCountMap, keyDecoder, valueDecoder);
		KafkaStream<String, String> stream = consumerMap.get(topic).get(0);
		ConsumerIterator<String, String> it = stream.iterator();
		MessageAndMetadata<String, String> record;
		while (it.hasNext()) {
			record = it.next();
			String msg = String.format("offset=%s, key=%s, value=%s", record.offset(), record.key(), record.message());
			logger.info(msg);

			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				logger.error(e.getMessage(), e);
			}
		}
	}

}
