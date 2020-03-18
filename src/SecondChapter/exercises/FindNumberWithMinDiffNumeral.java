package SecondChapter.exercises;

import java.util.Scanner;

/*
Найти число, в котором число различных цифр минимально. Если таких
чисел несколько, найти первое из них
 */
public class FindNumberWithMinDiffNumeral {

    private static int sumDiff = 0;
    private static int countOFDiffNumbers = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFromConsole = scanner.nextLine();
        String[] strArr = inputFromConsole.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            char[] diff = strArr[i].toCharArray();
            sumDiff = 0;
            int k = 1;
            for (int j = 0; j < diff.length; j++) {
                while (k < diff.length) {
                    if (diff[k] == diff[j]) {
                        sumDiff += 1;
                    }
                    k++;
                }
            }
            countOFDiffNumbers = diff.length - sumDiff;
            System.out.println(countOFDiffNumbers );
        }
    }
}
