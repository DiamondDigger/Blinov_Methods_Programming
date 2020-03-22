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
    private double numberOfGroup;

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

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setNumberOfCourse(int numberOfCourse) {
        this.numberOfCourse = numberOfCourse;
    }

    public void setNumberOfGroup(int number) {
        this.numberOfGroup = this.numberOfCourse+ (double)number/10;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getNumberOfCourse() {
        return numberOfCourse;
    }

    public double getNumberOfGroup() {
        return numberOfGroup;
    }

     @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthdayDate='" + birthdayDate + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", speciality='" + speciality + '\'' +
                ", numberOfCourse=" + numberOfCourse +
                ", numberOfGroup=" + numberOfGroup +
                '}';
    }
}
