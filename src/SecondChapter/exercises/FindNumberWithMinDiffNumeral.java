package SecondChapter.exercises;

import java.util.Scanner;

/*
Найти число, в котором число различных цифр минимально. Если таких
чисел несколько, найти первое из них
 */
public class FindNumberWithMinDiffNumeral {
    private static int[] charIndexDiff=new int[10];
    private static int sumDiff=0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFromConsole = scanner.nextLine();
        String[] strArr= inputFromConsole.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            char[] diff = strArr[i].toCharArray();
            for (int j = 1; j < diff.length; j++) {
                if (diff[j-1]!=diff[j]){
                    sumDiff += 1;
                }
            }
            charIndexDiff[i]=sumDiff;
            sumDiff=0;
            System.out.print(" - "+charIndexDiff[i]);
        }
    }
}
