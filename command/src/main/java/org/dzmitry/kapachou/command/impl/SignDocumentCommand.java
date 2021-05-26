package org.dzmitry.kapachou.command.impl;

import lombok.AllArgsConstructor;
import org.dzmitry.kapachou.command.model.Document;

@AllArgsConstructor
public class SignDocumentCommand implements DocumentCommand {

    @Override
    public void execute(Document document) {
        System.out.printf("sign document by: %s %n", document.getAuthor());
        document.setSigned(Boolean.TRUE);
    }
}
