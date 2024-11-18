package ru.ykul.Lms_notification.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import ru.ykul.Lms_notification.model.dto.CourseNotificationDto;

import java.util.List;

@Slf4j
@Component
public class KafkaNotificationEventsConsumer {

    @KafkaListener(id = "${spring.kafka.consumer.group-id}", topics = "${spring.kafka.topic.notification-events}")
    public void listener(@Payload List<CourseNotificationDto> massegeList) {

        massegeList.stream().map(CourseNotificationDto::getMessage)
                    .forEach(System.out::println);

        log.debug("KafkaNotificationEventsConsumer: records have been processed");
    }
}
