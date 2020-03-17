package SecondChapter.exercises;

import java.util.Scanner;

/*
Ввести n чисел с консоли.
Вывести на консоль те числа, длина которых меньше (больше) средней,
а также длину
 */

public class OutBiggerThenCurrentLength {
    private static int userLength = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFromConsole = scanner.nextLine();
        String[] strArr = inputFromConsole.split(" ");
        for (String s : strArr) {
            if (s.length()>userLength){
                System.out.println(s +" - " + s.length());
            }
        }
    }
}
