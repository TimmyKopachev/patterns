package org.dzmitry.kapachou.template.impl;

public abstract class DocumentService {

    public final void process(String content) {
        parseDocument(content);
        generateReports();
        collectStats();
    }

    protected abstract void parseDocument(String document);

    protected void generateReports() {
        System.out.println("generate common report");
    }

    protected abstract void collectStats();

}
