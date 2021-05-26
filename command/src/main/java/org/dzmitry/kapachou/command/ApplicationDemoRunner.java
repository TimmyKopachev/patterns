package org.dzmitry.kapachou.command;


import org.dzmitry.kapachou.command.impl.AuthorDocumentCommand;
import org.dzmitry.kapachou.command.impl.DocumentProcessor;
import org.dzmitry.kapachou.command.impl.SendDocumentCommand;
import org.dzmitry.kapachou.command.impl.SignDocumentCommand;
import org.dzmitry.kapachou.command.model.Document;

import java.net.UnknownHostException;

public class ApplicationDemoRunner {

    public static void main(String[] args) throws UnknownHostException {

        Document document = new Document("_document content_");

        DocumentProcessor documentProcessor = new DocumentProcessor();
        documentProcessor.addCommand(new AuthorDocumentCommand());
        documentProcessor.addCommand(new SignDocumentCommand());
        documentProcessor.addCommand(new SendDocumentCommand());

        documentProcessor.documentProcess(document);

        System.out.println(document);

    }
}
