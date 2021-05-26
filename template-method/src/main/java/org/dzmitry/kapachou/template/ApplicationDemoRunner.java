package org.dzmitry.kapachou.template;


import org.dzmitry.kapachou.template.impl.DocumentService;
import org.dzmitry.kapachou.template.impl.JsonDocumentProcessor;
import org.dzmitry.kapachou.template.impl.XmlDocumentProcessor;

public class ApplicationDemoRunner {

    public static void main(String[] args) {
        String content = "_content_";

        DocumentService docuService = new JsonDocumentProcessor();
        docuService.process(content);

        System.out.println("==================");

        docuService = new XmlDocumentProcessor();
        docuService.process(content);

    }
}
