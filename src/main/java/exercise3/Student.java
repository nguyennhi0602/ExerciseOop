package exercise3;

import java.util.Date;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private Date birthday;
    private String className;
    private String address;

    protected Student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.id;
        this.firstName = studentBuilder.firstName;
        this.lastName = studentBuilder.lastName;
        this.birthday = studentBuilder.birthday;
        this.className = studentBuilder.className;
        this.address = studentBuilder.address;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getClassName() {
        return className;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", className='" + className + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class StudentBuilder {
        public int id;
        public String firstName;
        public String lastName;
        public Date birthday;
        public String className;
        public String address;

        public static StudentBuilder newStudentBuilder() {
            return new StudentBuilder();
        }

        public StudentBuilder() {
        }

        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public StudentBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public StudentBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StudentBuilder setBirthday(Date birthday) {
            this.birthday = birthday;
            return this;
        }

        public StudentBuilder setClassName(String className) {
            this.className = className;
            return this;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", birthday='" + birthday + '\'' +
                    ", className='" + className + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }

    }
}
