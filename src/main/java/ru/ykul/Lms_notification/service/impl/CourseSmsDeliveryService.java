package ru.ykul.Lms_notification.service.impl;

import org.springframework.stereotype.Component;
import ru.ykul.Lms_notification.model.dto.CourseNotificationDto;
import ru.ykul.Lms_notification.service.DeliveryService;

@Component
public class CourseSmsDeliveryService implements DeliveryService {
    @Override
    public void sendCourseNotification(CourseNotificationDto notificationDto) {
        //в разработке
    }
}
