package ru.ykul.Lms_notification.model.dto;

import lombok.*;
import ru.ykul.Lms_notification.model.MessageType;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CourseStartNotificationEventDto {

    private MessageType type;
    private String message;
}
