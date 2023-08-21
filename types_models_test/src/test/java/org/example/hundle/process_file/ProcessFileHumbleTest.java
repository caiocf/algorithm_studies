package org.example.hundle.process_file;

import org.example.hundle.process_file.ProcessFileHumble;
import org.example.hundle.process_file.TransformText;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ProcessFileHumbleTest {

    @Test
    public void whenCallProcesFileThanSuccess() throws Exception {
        TransformText transformText = mock(TransformText.class);
        //when(transformText.transform("original context")).thenReturn("MOCKED CONTENT");
        when(transformText.transform(anyString())).thenReturn("MOCKED CONTENT");

        try(MockedStatic<Files> filesMock = mockStatic(Files.class);){
            filesMock.when( ()  -> Files.readString(Path.of("path/to/file"))).thenReturn("original context");

            ProcessFileHumble processFileHumble = new ProcessFileHumble(transformText);
            String result = processFileHumble.processar("path/to/file");

            assertEquals("MOCKED CONTENT", result);
            filesMock.verify(() -> Files.readString(Path.of("path/to/file")));
        }
    }

}
