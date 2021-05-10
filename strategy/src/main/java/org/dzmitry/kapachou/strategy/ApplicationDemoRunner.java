package org.dzmitry.kapachou.strategy;


import org.dzmitry.kapachou.strategy.impl.PrincipalNotificationService;
import org.dzmitry.kapachou.strategy.model.NotificationType;
import org.dzmitry.kapachou.strategy.model.Principal;

import java.util.Base64;

public class ApplicationDemoRunner {

    public static void main(String[] args) {
        Principal principal = Principal.builder()
                .username("timmykopachev")
                .password(Base64.getEncoder().encodeToString("password".getBytes()))
                .email("dzmitry.kapachou@email.com")
                .phone("+375#########")
                .notificationType(NotificationType.EMAIL)
                .build();

        System.out.println(principal);

        PrincipalNotificationService notificationService = new PrincipalNotificationService();

        notificationService.notifyPrincipal(principal);

        System.out.println("################################################");

        principal = Principal.builder()
                .username("kseniya")
                .password(Base64.getEncoder().encodeToString("password".getBytes()))
                .email("kseniya@email.com")
                .phone("+375#########")
                .notificationType(NotificationType.PHONE)
                .build();

        System.out.println(principal);

        notificationService.notifyPrincipal(principal);

    }
}
