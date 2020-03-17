package SecondChapter.exercises;

import java.util.Scanner;

public class findLongestNumber {
    private static String longerNumber;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFromConsole = scanner.nextLine();
        System.out.println(inputFromConsole);
        String[] lineOfNumber = inputFromConsole.split(" ");
        int maxLength = 1;
        String maxStrNumber = lineOfNumber[0];
        for (String s : lineOfNumber) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longerNumber = s;
            }
        }
        System.out.println("longerNumber=" + longerNumber + "; length = " + longerNumber.length());
    }
}