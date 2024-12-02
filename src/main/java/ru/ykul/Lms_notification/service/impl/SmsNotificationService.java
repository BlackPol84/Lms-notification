package ru.ykul.Lms_notification.service.impl;

import org.springframework.stereotype.Component;
import ru.ykul.Lms_notification.model.dto.NotificationDto;
import ru.ykul.Lms_notification.service.NotificationService;

@Component
public class SmsNotificationService implements NotificationService {
    @Override
    public void send(NotificationDto notificationDto) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
