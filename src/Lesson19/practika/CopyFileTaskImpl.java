package Lesson19.practika;


import Lesson19.FileCopyUtils;

public class CopyFileTaskImpl extends TaskImpl implements CopyFileTask {

    private String from;
    private String to;
    private FileCopyUtils copyUtils;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public FileCopyUtils getCopyUtils() {
        return copyUtils;
    }


    @Override
    public void execute() throws TaskExecutionFailedException {
        try {
            copyUtils.copyFile(from, to);
        } catch (Exception e) {
            throw new TaskExecutionFailedException(e.getMessage());
        }
    }

    @Override
    public void setFileCopyUtils(FileCopyUtils copyUtils) {
        this.copyUtils = copyUtils;
    }
}
