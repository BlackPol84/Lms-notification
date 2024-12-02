package ru.ykul.Lms_notification.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ykul.Lms_notification.model.MessageType;
import ru.ykul.Lms_notification.model.dto.NotificationDto;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class NotificationAdapter {

    private final Map<MessageType, NotificationService> notificationServiceMap;

    public void sendNotification(List<NotificationDto> messageList) {
        for(NotificationDto notification : messageList) {
            NotificationService deliveryService = notificationServiceMap.get(notification.type());
            deliveryService.send(notification);
        }
    }
}
