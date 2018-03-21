/**
 * @Title: Receiver.java
 * @Package com.cw.mq.test
 * @Description: 消息接收者
 * Copyright: Copyright (c) 2014
 * Company:YY Inc
 * @author WuLiangzhi
 * @date Aug 23, 2015 2:11:46 PM
 * @version V1.0
 */

package com.cw.activemq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: Receiver
 * @Description: 消息接收者
 * @author WuLiangzhi
 * @date Aug 23, 2015 2:11:46 PM
 *
 */

public class Receiver {

    private static final Logger LOG = LoggerFactory.getLogger(Receiver.class);

    public static void main(String[] args) {
        // ConnectionFactory : 连接工厂，JMS用它创建连接
        ConnectionFactory connectionFactory;
        // Connection : JMS客户端到JMS Provider的连接
        Connection connection = null;
        // Session : 一个发送或者接收消息的线程
        Session session = null;
        // Destination : 消息的目的地，消息发送给谁
        Destination destination;
        // MessageConsumer : 消费者，消息接收者
        MessageConsumer consumer = null;

        String brokerURL = "tcp://localhost:61616";
        String queueName = "FirstQueue";

        connectionFactory = new ActiveMQConnectionFactory(
                ActiveMQConnection.DEFAULT_USER,
                ActiveMQConnection.DEFAULT_PASSWORD, brokerURL);

        try {
            // 从构造工厂得到连接对象
            connection = connectionFactory.createConnection();

            // 启动
            connection.start();

            // 获取操作连接
            session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);

            // 获取消息目的地对象，注意 queueName是队列名称，需在ActiveMQ的console中配置
            destination = session.createQueue(queueName);

            // 创建消费者对象
            consumer = session.createConsumer(destination);

            while (true) {
                TextMessage message = (TextMessage) consumer.receive(10000);
                if (null != message) {
                    LOG.info("接收到消息: {}", message.getText());
                } else {
//					break;
                    Thread.sleep(1000);
                }
            }
        } catch (JMSException e) {
            LOG.error(e.getMessage(), e);
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        } finally {
            try {
                if (consumer != null) {
                    consumer.close();
                }
                if (session != null) {
                    session.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (JMSException e) {
                LOG.error(e.getMessage(), e);
            }
        }

    }

}
