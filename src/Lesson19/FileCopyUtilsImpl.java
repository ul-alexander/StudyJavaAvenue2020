package Lesson19;

import java.io.*;

public class FileCopyUtilsImpl implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileNotFoundException {
        File sour = new File(source);
        File dest = new File(destination);
        if (!sour.exists()) {
            throw new FileNotFoundException("Source file is not found!");
        } else if (dest.exists()) {
            throw new FileAlreadyExistsException("File destination is already exist!");
        }
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination));

            int c;

            while (true) {
                c = bis.read();
                if (c != -1)
                    bos.write(c);
                else
                    break;
            }
            bis.close();
            bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
            bos.close(); //закрываем поток записи (обязательно!)

        } catch (java.io.IOException e) {
            throw new FileCopyFailedException(e.getMessage(), e);
        }
    }
}


