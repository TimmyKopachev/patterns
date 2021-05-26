package org.dzmitry.kapachou.template.impl;

public class JsonDocumentProcessor extends DocumentService {

    @Override
    public void parseDocument(String document) {
        System.out.printf("JSON document: %s%n", document);
    }

    @Override
    public void collectStats() {
        System.out.println("Json collect stats");
    }

}
