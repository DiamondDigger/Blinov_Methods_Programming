package ThirdChapter.examples;

import java.util.Scanner;

public enum MusicStyle {
    JAZZ, ROCK, DRUM, TRANCE, FOLK
}

class MusicRunner {
    public static void main(String[] args) {

        MusicStyle ms = MusicStyle.ROCK;
        System.out.println(ms);
        Scanner scanner = new Scanner(System.in);
        String inputFromConsole = scanner.nextLine();
        if (inputFromConsole.equals(ms.toString())){
            System.out.println(inputFromConsole);
        }else {
            System.out.println("Didn't guess!");
        }
        switch (ms){
            case DRUM:
                System.out.println("This this DRUM, BABY!");
                break;
            case JAZZ:
                System.out.println("This this JAZZ, BABY!");
                break;
            case ROCK:
                System.out.println("This this ROCK, BABY!");
                break;
            case TRANCE:
                System.out.println("This this TRANCE, BABY!");
                break;
            default:
                System.out.println("Couldn't find your genre..sorry");
        }
    }
}