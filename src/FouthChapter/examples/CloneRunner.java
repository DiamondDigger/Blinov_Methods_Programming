package FouthChapter.examples;

public class CloneRunner {
    private static void mutation(Student obj) {
        try {
            obj = (Student) obj .clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        obj.setId(333);
        System.out.println("->id = "+ obj.getId());
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getId());
        mutation(student);
        System.out.println(student.getId());


    }
}
