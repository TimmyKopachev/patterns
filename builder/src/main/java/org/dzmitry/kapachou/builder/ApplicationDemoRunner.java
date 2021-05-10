package org.dzmitry.kapachou.builder;


import java.time.LocalDateTime;

import static org.dzmitry.kapachou.builder.TrainingBuilder.trainingBuilder;

public class ApplicationDemoRunner {

    public static void main(String[] args) {

        Training training = trainingBuilder()
                .withName("java course")
                .withDescription("advanced course to grow up as a developer")
                .withSession(new Session("Spring Cloud", "config; feign; hystrix", LocalDateTime.now()))
                .withSession(new Session("Distributed transactions", "SAGA; event based", LocalDateTime.now()))
                .withSession(new Session("Spring Security", "auth2/jwt; ACL/ACE", LocalDateTime.now()))
                .build();

        System.out.println(training);

    }
}
