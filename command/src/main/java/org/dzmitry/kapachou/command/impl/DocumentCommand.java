package org.dzmitry.kapachou.command.impl;

import org.dzmitry.kapachou.command.model.Document;

public interface DocumentCommand {

    void execute(Document document);
}
