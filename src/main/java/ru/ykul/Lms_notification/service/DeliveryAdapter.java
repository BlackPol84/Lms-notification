package ru.ykul.Lms_notification.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ykul.Lms_notification.model.MessageType;
import ru.ykul.Lms_notification.model.dto.CourseNotificationDto;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class DeliveryAdapter {

    private final Map<MessageType, DeliveryService> deliveryServiceMap;

    public void sendNotification(List<CourseNotificationDto> messageList) {
        for(CourseNotificationDto notification : messageList) {
            DeliveryService deliveryService = deliveryServiceMap.get(notification.type());
            deliveryService.sendCourseNotification(notification);
        }
    }
}
