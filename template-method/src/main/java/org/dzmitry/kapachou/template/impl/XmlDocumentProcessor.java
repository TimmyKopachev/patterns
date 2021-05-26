package org.dzmitry.kapachou.template.impl;

public class XmlDocumentProcessor extends DocumentService {

    @Override
    public void parseDocument(String document) {
        System.out.printf("XML document: %s%n", document);
    }

    @Override
    public void collectStats() {
        System.out.println("XML collect stats");
    }
}
