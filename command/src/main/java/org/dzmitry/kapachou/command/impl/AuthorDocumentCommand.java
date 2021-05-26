package org.dzmitry.kapachou.command.impl;

import lombok.SneakyThrows;
import org.dzmitry.kapachou.command.model.Document;

public class AuthorDocumentCommand implements DocumentCommand {

    @SneakyThrows
    @Override
    public void execute(Document document) {
        document.setAuthor(java.net.InetAddress.getLocalHost().getHostName());
        System.out.printf("add author: %s %n", document.getAuthor());
    }
}
