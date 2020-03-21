package ThirdChapter.exercises.A_01;

public class Student {
    private long id;
    private String firstName;
    private String secondName;
    private String lastName;
    private String birthdayDate;
    private String telNumber;
    private String speciality;
    private int numberOfCourse;
    private int numberOfGroup;

    public Student(long id, String firstName, String secondName, String lastName, String birthdayDate) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.birthdayDate = birthdayDate;
    }

    public Student(String firstName, String secondName, String lastName, String birthdayDate, String telNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.birthdayDate = birthdayDate;
        this.telNumber = telNumber;
    }

    public Student(String firstName, String secondName, String lastName, String birthdayDate, String telNumber, String speciality) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.birthdayDate = birthdayDate;
        this.telNumber = telNumber;
        this.speciality = speciality;
    }
}
