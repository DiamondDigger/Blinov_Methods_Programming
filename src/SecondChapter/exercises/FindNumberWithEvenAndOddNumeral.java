package SecondChapter.exercises;

import java.util.Scanner;
/*
Найти количество чисел, содержащих только четные цифры, а среди них —
количество чисел с равным числом четных и нечетных цифр.
 */

public class FindNumberWithEvenAndOddNumeral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFromConsole = scanner.nextLine();
        String[] strArr = inputFromConsole.split(" ");
        for (String s : strArr) {
            char[] chArr = s.toCharArray();
            int numberLength = chArr.length;
            for (int i = 0; i < chArr.length; i++) {
                int number = Character.digit(chArr[i],10);
                System.out.print(number);
            }
            System.out.print(" ");
            System.out.println(numberLength);
        }
    }
}
