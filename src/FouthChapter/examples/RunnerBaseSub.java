package FouthChapter.examples;

public class RunnerBaseSub {
    public static void main(String[] args) {
        Base ob = new Sub();

        // плохой спомоб обращения к статическому методу - надо через
        // класс - Base.printMessage()
        ob.printMessage();   //метод Base - по типу ссылки а не типу объекта на который ссылка
        System.out.println();

        // правильное обращение
        Base.printMessage();
        Sub.printMessage();

    }
}
