package Lesson17.HomeWork;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

public class FileCopyUtilsImpl implements FileCopyUtils {

    private File source;
    private File destination;


    private boolean filesSource(File source, File destination) throws FileNotFoundException, FileAlreadyExistsException {
        if (!source.exists()) {
            throw new FileNotFoundException("Файл для копирования не найден!");
        }
        if (destination.exists()) {
            throw new FileAlreadyExistsException("Файл который вы копируете уже существует!");
        }
        return true;
    }

    ///////////////////////////////////////////////////////
    //Method
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException {
        //Get files
        this.source = new File(source);
        this.destination = new File(destination);
        //Check files
        try {
            if (this.filesSource(this.source, this.destination)) {
                //Copy
                try {
                    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(this.source));
                    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(this.destination));
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
                    if (!this.destination.exists()) {
                        throw new FileCopyFailedException("Ошибка! Копирование не завершено:-(");
                    } else {
                        System.out.println("Файл скопирован!");
                    }
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    ///////////////////////////////////////////////////////
    //Method 1
    public void copyFile1(String source, String destination) throws FileCopyFailedException {
        //Get files
        this.source = new File(source);
        this.destination = new File(destination);
        //Check files
        try {
            if (this.filesSource(this.source, this.destination)) {
                //Copy
                try {

                    FileChannel sourceChannel = new FileInputStream(source).getChannel();
                    FileChannel destChannel = new FileOutputStream(destination).getChannel();
                    destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
                    sourceChannel.close();
                    destChannel.close();
                    if (!this.destination.exists()) {
                        throw new FileCopyFailedException("Ошибка! Копирование не завершено:-(");
                    } else {
                        System.out.println("Файл скопирован!");
                    }

                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    ///////////////////////////////////////////////////////
    //Method 2
    public void copyFile2(String source, String destination) throws FileCopyFailedException {
        //Get files
        this.source = new File(source);
        this.destination = new File(destination);
        //Check files
        try {
            if (this.filesSource(this.source, this.destination)) {
                //Copy
                try {
                    Files.copy(this.source.toPath(), this.destination.toPath());
                    if (!this.destination.exists()) {
                        throw new FileCopyFailedException("Ошибка! Копирование не завершено:-(");
                    } else {
                        System.out.println("Файл скопирован!");
                    }

                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
