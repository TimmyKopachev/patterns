package org.dzmitry.kapachou.strategy.impl;

import org.dzmitry.kapachou.strategy.model.Principal;

public class EmailNotificationSender implements NotificationSenderStrategy {

    @Override
    public void sendNotification(Principal principal) {
        System.out.printf("send email notification to %s%n", principal.getEmail());
    }
}
