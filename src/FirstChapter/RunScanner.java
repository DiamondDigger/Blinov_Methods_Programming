package FirstChapter;

import java.util.Scanner;

public class RunScanner {
    public static void main(String[] args) {
        System.out.println("Enter your message, please: ");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();
        System.out.println(message);
        scanner.close();
    }
}
