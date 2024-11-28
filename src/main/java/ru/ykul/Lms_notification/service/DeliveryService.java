package ru.ykul.Lms_notification.service;

import ru.ykul.Lms_notification.model.dto.CourseNotificationDto;

public interface DeliveryService {

    void sendCourseNotification(CourseNotificationDto notificationDto);
}
