package ThirdChapter.exercises.A_01;

public class CreateFileForLogging {
    private String pathName;
    private String fileName;

    public CreateFileForLogging(String pathName, String fileName) {
        this.pathName = pathName;
        this.fileName = fileName;
    }

    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
