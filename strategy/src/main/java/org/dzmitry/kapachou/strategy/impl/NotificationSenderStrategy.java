package org.dzmitry.kapachou.strategy.impl;

import org.dzmitry.kapachou.strategy.model.Principal;

public interface NotificationSenderStrategy {

    void sendNotification(Principal principal);

}
