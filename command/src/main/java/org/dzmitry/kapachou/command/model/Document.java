package org.dzmitry.kapachou.command.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Document {

    private String author;
    private String content;
    private boolean signed;

    public Document(String content) {
        this.content = content;
    }
}
