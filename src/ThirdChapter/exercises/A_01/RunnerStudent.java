package ThirdChapter.exercises.A_01;

public class RunnerStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Jane", "Mack", "Con","10.11.13","123-456-789");
        Student student2 = new Student("Karl", "Mk", "Ceb","12.02.10","222-222-789");
        Student student3 = new Student("John", "Sal", "Bon","03.10.98","333-333-789");
        Student student4 = new Student("Jan", "Bit", "Cel","01.09.88","433-456-789");

        System.out.println("student1 - "+student1);
        System.out.println("student2 - "+student2);
        System.out.println("student3 - "+student3);
        System.out.println("student4 - "+student4);

        System.out.println("********Setting missing parameters***********");

        student1.setId(1l);
        student2.setId(2l);
        student3.setId(3l);
        student4.setId(4l);

        student1.setNumberOfCourse(2);
        student2.setNumberOfCourse(2);
        student3.setNumberOfCourse(3);
        student4.setNumberOfCourse(4);

        student1.setSpeciality("electric");
        student1.setSpeciality("medicine");
        student1.setSpeciality("physics");
        student1.setSpeciality("mathematics");

        student1.setNumberOfGroup(1.1);
        student1.setNumberOfGroup(2.1);
        student1.setNumberOfGroup(3.1);
        student1.setNumberOfGroup(4.1);

        System.out.println("student1 - "+student1);
        System.out.println("student2 - "+student2);
        System.out.println("student3 - "+student3);
        System.out.println("student4 - "+student4);
    }
}