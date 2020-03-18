package SecondChapter.exercises;

import java.util.Scanner;

public class FindNumberWirhEvenAndOddNumeral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFromConsole = scanner.nextLine();
        String[] strArr = inputFromConsole.split(" ");
        for (String s : strArr) {
            char[] chArr = s.toCharArray();
            for (int i = 0; i < chArr.length; i++) {
                int number = Character.digit(chArr[i],10);
                System.out.print(number);
            }
            System.out.print(" ");

        }
    }
}
