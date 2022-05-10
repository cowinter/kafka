package com.example.consumer.config;

import org.springframework.messaging.MessageChannel;

/**
 * @author Shen
 * @Description kafka通道
 * @createTime 2022-05-10
 */
public interface KafkaChannel {
    String DEFAULT_OUT = "default_out";
    String DEFAULT_INPUT = "default_input";
    String TOPIC_OUT = "topic_out";
    String TOPIC_INPUT = "topic_input";

//    @Output("")
    MessageChannel sendDefaultMsg();

    MessageChannel sendTopicMsg();

    MessageChannel receiveDefaultMsg();

    MessageChannel receiveTopicMsg();
}
