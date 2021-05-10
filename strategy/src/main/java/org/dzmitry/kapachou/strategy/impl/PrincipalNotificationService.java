package org.dzmitry.kapachou.strategy.impl;

import lombok.AllArgsConstructor;
import org.dzmitry.kapachou.strategy.model.Principal;

@AllArgsConstructor
public class PrincipalNotificationService {

    private final NotificationResolver notificationResolver = new NotificationResolver();

    public void notifyPrincipal(Principal principal) {
        NotificationSenderStrategy notificationSender = notificationResolver.resolveSender(principal.getNotificationType());
        notificationSender.sendNotification(principal);
    }

}
