package ru.ykul.Lms_notification.model.dto;

import ru.ykul.Lms_notification.model.MessageType;

public record NotificationDto(MessageType type,
                              String email,
                              String message
                                    ) { }
