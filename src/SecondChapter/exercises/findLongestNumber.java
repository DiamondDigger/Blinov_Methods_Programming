package SecondChapter.exercises;

import java.util.Scanner;

/*
Ввести n чисел с консоли.
 Найти самое короткое и самое длинное число. Вывести найденные числа
и их длину.
*/
public class findLongestNumber {
    private static final String SEQUENCE_OF_NUMBERS = "1 22 333 4 4444 123456789 123 2 12345678 "; // for test
    private static String longerNumber;
    private static String shorterNumber;
    private static int minLength = 10;
    private static int maxLength = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFromConsole = scanner.nextLine();
        System.out.println(inputFromConsole);
        String[] lineOfNumber = inputFromConsole.split(" ");
        for (String s : lineOfNumber) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longerNumber = s;
            } else if (s.length() < minLength) {
                minLength = s.length();
                shorterNumber = s;
            }
        }
        System.out.println("longerNumber= " + longerNumber + "; length = " + longerNumber.length());
        System.out.println("shorterNumber= " + shorterNumber + "; length = " + shorterNumber.length());
    }
}