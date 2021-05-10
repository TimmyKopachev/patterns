package org.dzmitry.kapachou.strategy.impl;

import org.dzmitry.kapachou.strategy.model.Principal;

public class PhoneNotificationSender implements NotificationSenderStrategy {

    @Override
    public void sendNotification(Principal principal) {
        System.out.printf("send phone notification to %s%n", principal.getPhone());
    }
}
