package org.dzmitry.kapachou.strategy.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Principal {

    private String username;
    private String email;
    private String password;
    private String phone;

    private NotificationType notificationType;

}
