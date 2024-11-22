package ru.ykul.Lms_notification.exception;

public class KafkaNotRetryableRuntimeException extends RuntimeException {

    public KafkaNotRetryableRuntimeException(String message) {
        super(message);
    }
}
