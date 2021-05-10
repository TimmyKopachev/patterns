package org.dzmitry.kapachou.builder;

import java.util.ArrayList;
import java.util.List;

public class TrainingBuilder {

    private String name;

    private String description;

    private List<Session> session = new ArrayList<>();

    public static TrainingBuilder trainingBuilder() {
        return new TrainingBuilder();
    }

    public TrainingBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public TrainingBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public TrainingBuilder withSession(Session session) {
        this.session.add(session);
        return this;
    }

    public Training build() {
        return new Training(name, description, session);
    }

}
