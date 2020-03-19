package ThirdChapter.examples;

public class RunnerExam {
    public static void main(String[] args) {
        Exam<Double> doubleExam1 = new Exam<Double>("Steve", 1.3);
        Exam<Double> doubleExam2 = new Exam<Double>("Mack", 1.38);
        Exam<Integer> integerExam1 = new Exam<Integer>("Sara", 3);
        Exam<Integer> integerExam2 = new Exam<Integer>("Kon", 3);

        System.out.println("First: "+doubleExam1.equalsToMark(doubleExam2));
        System.out.println("with <?> :"+doubleExam1.equalsToMark(integerExam1));// - expected <Double>
        System.out.println("Second: "+integerExam2.equalsToMark(integerExam1));
        System.out.println("Third: "+integerExam2.equalsToMark(integerExam2));
    }
}
