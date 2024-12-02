package ru.ykul.Lms_notification.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import ru.ykul.Lms_notification.model.dto.NotificationDto;
import ru.ykul.Lms_notification.service.NotificationService;

@Component
@RequiredArgsConstructor
public class EmailNotificationService implements NotificationService {

    private final JavaMailSender mailSender;

    public void send(NotificationDto notificationDto) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(notificationDto.email());
        message.setSubject("Lms-notification");
        message.setText(notificationDto.message());
        mailSender.send(message);
    }
}
