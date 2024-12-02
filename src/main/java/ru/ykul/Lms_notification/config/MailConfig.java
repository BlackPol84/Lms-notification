package ru.ykul.Lms_notification.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import ru.ykul.Lms_notification.model.MessageType;
import ru.ykul.Lms_notification.service.NotificationService;

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
    public Map<MessageType, NotificationService> notificationServiceMap
            (NotificationService emailNotificationService, NotificationService smsNotificationService) {
        Map<MessageType, NotificationService> notificationServiceMap =
                new EnumMap<>(MessageType.class);
        notificationServiceMap.put(MessageType.EMAIL, emailNotificationService);
        notificationServiceMap.put(MessageType.SMS, smsNotificationService);
        return notificationServiceMap;
    }
}
