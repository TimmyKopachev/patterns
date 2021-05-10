package org.dzmitry.kapachou.strategy.impl;

import org.dzmitry.kapachou.strategy.model.NotificationType;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class NotificationResolver {

    private static final Map<NotificationType, Supplier<NotificationSenderStrategy>> NOTIFICATION_IMPL_SUPPLIER;

    static {
        final Map<NotificationType, Supplier<NotificationSenderStrategy>> notifications = new HashMap<>();

        notifications.put(NotificationType.EMAIL, EmailNotificationSender::new);
        notifications.put(NotificationType.PHONE, PhoneNotificationSender::new);

        NOTIFICATION_IMPL_SUPPLIER = Collections.unmodifiableMap(notifications);
    }

    public NotificationSenderStrategy resolveSender(NotificationType type) {
        Supplier<NotificationSenderStrategy> notificationSenderSupplier = NOTIFICATION_IMPL_SUPPLIER.get(type);

        if (notificationSenderSupplier == null) {
            throw new IllegalArgumentException(String.format("Invalid notification type: %s", type));
        }

        return notificationSenderSupplier.get();
    }
}
