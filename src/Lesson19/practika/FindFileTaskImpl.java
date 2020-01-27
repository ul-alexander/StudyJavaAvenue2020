package Lesson19.practika;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FindFileTaskImpl extends TaskImpl implements FindFilesTask {

    private String directory;
    private String searchString;
    private PrintStream out;

    public String getDirectory() {
        return directory;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public PrintStream getOut() {
        return out;
    }

    public void setOut(PrintStream out) {
        this.out = out;
    }


    @Override
    public void setDirectory(String directory) throws NullPointerException, FileNotFoundException {

    }

    @Override
    public void setFileNameSearchString(String searchString) throws IllegalArgumentException {

    }

    @Override
    public void setPrintStream(PrintStream out) {

    }

    @Override
    public void execute() throws TaskExecutionFailedException {

        File dir = new File(directory);

        if (!dir.exists()) {
            new TaskExecutionFailedException("Путь некоректен!!!");
        }
        
        if (!dir.isDirectory()) {
            throw new TaskExecutionFailedException("Это файл , а не папка!");
        }

        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {

                if (pathname.getName().contains(searchString)) {
                    return true;
                }

                return false;

            }

        });

        for (File f : files) {
            out.println(f.getAbsolutePath());
        }

    }
}
