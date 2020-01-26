package Lesson19.Praktika;

import java.io.*;
import java.nio.channels.FileChannel;

public class FileChanelCopyUtilsImpl implements FileCopyUtils {
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
            FileChannel sourceChannel = new FileInputStream(source).getChannel();
            FileChannel destChannel = new FileOutputStream(destination).getChannel();
            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
            sourceChannel.close();
            destChannel.close();
        } catch (IOException e) {
            throw new FileCopyFailedException(e.getMessage(), e);
        }
    }
}
