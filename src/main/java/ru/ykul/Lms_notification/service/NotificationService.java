package ru.ykul.Lms_notification.service;

import ru.ykul.Lms_notification.model.dto.NotificationDto;

public interface NotificationService {

    void send(NotificationDto notificationDto);
}
