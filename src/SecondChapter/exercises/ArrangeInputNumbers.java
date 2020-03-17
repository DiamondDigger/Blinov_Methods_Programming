package SecondChapter.exercises;

import java.util.Scanner;

/*
Ввести n чисел с консоли.
Упорядочить и вывести числа в порядке возрастания (убывания) значений
их длины.
*/


public class ArrangeInputNumbers {
    private static final String SEQUENCE_OF_NUMBERS = "1 22 333 4 4444 123456789 123 2 12345678 "; // for test

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFromConsole = scanner.nextLine();
        String[] strArray = inputFromConsole.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray.length; j++) {
                String tempValue;
                if (strArray[i].length() > strArray[j].length()) {
                    tempValue = strArray[i];
                    strArray[i] = strArray[j];
                    strArray[j] = tempValue;
                }
            }
        }
        for (String s : strArray) {
            System.out.println(s);
        }
        scanner.close();
    }
}
