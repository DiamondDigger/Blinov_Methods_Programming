package ThirdChapter.exercises.A_01;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFileForLogging {
    private String pathName = "D:\\home_Projects\\udemy\\practice-java-building-projects\\Blinov\\Begining\\src\\ThirdChapter\\resources\\logNames.txt";

    private String fileName;

    public CreateFileForLogging() throws IOException {
    }

    private FileWriter fileWriter = new FileWriter(pathName);

    public CreateFileForLogging(String pathName) throws IOException {
        this.pathName = pathName;
    }

    public CreateFileForLogging(String pathName, String fileName) throws IOException {
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

    public void addInfoInFile(String text, boolean close) throws IOException {
        boolean closeWriter = close;
//        FileWriter fileWriter = new FileWriter(pathName);
        fileWriter.append("********************************************\n");
        fileWriter.append(text);
        fileWriter.append("\n");
        if (closeWriter) {
            fileWriter.close();
        }
    }
}
