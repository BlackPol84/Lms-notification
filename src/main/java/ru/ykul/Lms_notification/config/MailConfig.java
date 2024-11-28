package ru.ykul.Lms_notification.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import ru.ykul.Lms_notification.model.MessageType;
import ru.ykul.Lms_notification.service.DeliveryService;
import ru.ykul.Lms_notification.service.impl.CourseEmailDeliveryService;

import java.util.EnumMap;
import java.util.Map;

@Configuration
public class MailConfig {

    @Value("${spring.mail.host}")
    private String host;
    @Value("${spring.mail.port}")
    private Integer port;

    @Bean
    public JavaMailSender javaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(host);
        mailSender.setPort(port);
        return mailSender;
    }

    @Bean
    public Map<MessageType, DeliveryService> deliverylServiceMap(CourseEmailDeliveryService emailService) {
        Map<MessageType, DeliveryService> deliverylServiceMap = new EnumMap<>(MessageType.class);
        deliverylServiceMap.put(MessageType.EMAIL, emailService);
        return deliverylServiceMap;
    }
}
