package ru.ykul.Lms_notification.kafka.notificationevents.consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import ru.ykul.Lms_notification.model.dto.CourseNotificationDto;
import ru.ykul.Lms_notification.service.DeliveryAdapter;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class KafkaNotificationEventsConsumer {

    private final DeliveryAdapter adapter;

    @KafkaListener(id = "${spring.kafka.consumer.group-id}",
                   topics = "${spring.kafka.topic}")
    public void listener(@Payload List<CourseNotificationDto> messageList) {
        adapter.sendNotification(messageList);

        log.debug("KafkaNotificationEventsConsumer: records have been processed");
    }
}
