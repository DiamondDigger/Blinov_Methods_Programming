package SecondChapter;

public class DemoArrays {
    public static void main(String[] args) {
        int[] ArrInt = new int[10];
        String[] ArrString = new String[4];
        System.out.println("ArrInt[]:");
        for (int elemInt : ArrInt) {
            System.out.print(elemInt+ " - ");
        }
        System.out.println("\n");
        System.out.println("ArrString[]:");
        for (String elemStr : ArrString) {
            System.out.print(elemStr+ " - ");
        }
    }
}
