package SecondChapter.exercises;

import java.util.Scanner;

/*
Найти число, в котором число различных цифр минимально. Если таких
чисел несколько, найти первое из них
 */
public class FindNumberWithMinDiffNumeral {
    private static int[] charIndexDiff = new int[10];
    private static int sumDiff = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFromConsole = scanner.nextLine();
        String[] strArr = inputFromConsole.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            char[] diff = strArr[i].toCharArray();
            for (int j = 0; j < diff.length; j++) {
                int countOfUnequals = 0;
                for (int k = 0; k < diff.length; k++) {
                    if(diff[j]==diff[k]&&(k<j)){
                        break;
                    }
                        if (diff[j] != diff[k]) {
                        countOfUnequals += 1;
                    }
                }
                if (countOfUnequals != 0) {
                    sumDiff += 1;
                }
            }
            charIndexDiff[i] = sumDiff;
            sumDiff = 0;
            System.out.print(" - " + charIndexDiff[i]);
        }
    }
}
