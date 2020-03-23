package ThirdChapter.exercises.A_01;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.security.SecureRandom;

public class GetNameFromFile {

    public String getNameFromFile() throws IOException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        String fileName = "ThirdChapter/resources/Names.txt";
        File file = new File(classLoader.getResource(fileName).getFile());
        String content = new String(Files.readAllBytes(file.toPath()));
        String[] namesArr = content.split(" ");
        SecureRandom secureRandom = new SecureRandom();
        int number = secureRandom.nextInt(namesArr.length);
        return namesArr[number];
    }

}
