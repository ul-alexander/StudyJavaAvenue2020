package Lesson19.Praktika;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

public class CopyWithJava7Utils implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException, FileNotFoundException {
        File sour = new File(source);
        File dest = new File(destination);

        if (!sour.exists()) {
            throw new FileNotFoundException("Source file is not found!");
        } else if (dest.exists()) {
            throw new FileAlreadyExistsException("File destination is already exist!");
        }

        try {
            Files.copy(sour.toPath(), dest.toPath());
        } catch (IOException e) {
            throw new FileCopyFailedException(e.getMessage(), e);
        }
    }
}
