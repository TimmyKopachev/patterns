package org.dzmitry.kapachou.command.impl;

import org.dzmitry.kapachou.command.model.Document;

import java.util.LinkedList;
import java.util.List;

public class DocumentProcessor {

    List<DocumentCommand> documentCommands = new LinkedList<>();

    public void documentProcess(Document document) {
        documentCommands.forEach(docuCommand -> docuCommand.execute(document));
    }

    public List<DocumentCommand> addCommand(DocumentCommand docuCommand) {
        documentCommands.add(docuCommand);
        return documentCommands;
    }
}
