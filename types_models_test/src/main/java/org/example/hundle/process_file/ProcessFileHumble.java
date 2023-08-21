package org.example.hundle.process_file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ProcessFileHumble {
    private TransformText transform;

    public ProcessFileHumble(TransformText transform) {
        this.transform = transform;
    }

    public String processar(String pathFile) throws IOException {
        String content = Files.readString(Path.of(pathFile));
        return transform.transform(content);
    }
}
