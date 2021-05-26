package org.dzmitry.kapachou.command.impl;

import org.dzmitry.kapachou.command.model.Document;

public class SendDocumentCommand implements DocumentCommand {

    @Override
    public void execute(Document document) {
        System.out.printf("send document to: %s %n", document.getAuthor());
    }
}
