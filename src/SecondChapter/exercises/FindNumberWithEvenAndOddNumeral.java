package SecondChapter.exercises;

import java.util.Scanner;
/*
Найти количество чисел, содержащих четные цифры, а среди них —
количество чисел с равным числом четных и нечетных цифр.
 */

public class FindNumberWithEvenAndOddNumeral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFromConsole = scanner.nextLine();
        String[] strArr = inputFromConsole.split(" ");
        for (String s : strArr) {
            char[] charArrayOfNumbers = s.toCharArray();
            int numberLength = charArrayOfNumbers.length;
            int sumEven = 0;
            int j = 0;
            for (int i = 0; i < charArrayOfNumbers.length; i++) {
                int number = Character.digit(charArrayOfNumbers[i], 10);
                if (number % 2 == 0) {
                    sumEven += 1;
                }
                System.out.print("|"+number+"|");
            }
            System.out.print(" ");
            System.out.print("L="+numberLength+"--"+sumEven+" ");
            if ((numberLength - sumEven )== (numberLength/2)){
                System.out.println("<<<!GOT IT!>>>");
            }else System.out.println();
        }
    }
}
