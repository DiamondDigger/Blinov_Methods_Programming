package ThirdChapter.exercises.A_01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateAndWriteToFile {
    private static String pathName = "D:\\home_Projects\\udemy\\practice-java-building-projects\\Blinov\\Begining\\src\\ThirdChapter\\resources\\log.txt";
    private FileWriter fileWriter = new FileWriter(pathName);

    public CreateAndWriteToFile() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        File file = new File(pathName);
        boolean createFile = false;
        if (file.createNewFile()) {
            createFile = true;
            System.out.println("File created! Yap!");
        }

        if (createFile) {
            FileWriter fileWriter = new FileWriter(pathName);
            fileWriter.write("************************************");
            fileWriter.close();
        } else {
            System.out.println("Didn't create file log.txt");
        }
    }

    public String getPathName() {
        return pathName;
    }

    public void writeToFile(String text, boolean close) throws IOException {
        boolean closeWriter = close;
        fileWriter.write(text);
        if (close){
            fileWriter.close();
        }
    }


}
