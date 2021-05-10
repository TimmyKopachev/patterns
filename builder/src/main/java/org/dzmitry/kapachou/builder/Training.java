package org.dzmitry.kapachou.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Training {

    private String name;

    private String description;

    private List<Session> session;
}
