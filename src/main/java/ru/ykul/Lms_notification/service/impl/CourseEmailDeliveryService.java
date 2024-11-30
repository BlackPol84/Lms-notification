package ru.ykul.Lms_notification.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import ru.ykul.Lms_notification.model.dto.CourseNotificationDto;
import ru.ykul.Lms_notification.service.DeliveryService;

@Component
@RequiredArgsConstructor
public class CourseEmailDeliveryService implements DeliveryService {

    private final JavaMailSender mailSender;

    public void sendCourseNotification(CourseNotificationDto notificationDto) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(notificationDto.email());
        message.setSubject("Lms-notification");
        message.setText(notificationDto.message());
        mailSender.send(message);
    }
}
