package ru.ykul.Lms_notification.model.dto;

import lombok.*;
import ru.ykul.Lms_notification.model.MessageType;

public record CourseNotificationDto(MessageType type,
                                    String email,
                                    String message
                                    ) { }
