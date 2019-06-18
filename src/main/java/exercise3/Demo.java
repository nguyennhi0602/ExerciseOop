package exercise3;

public class Demo {
    public static void main(String[] args) {
        Student st=Student.StudentBuilder.newStudentBuilder().setId(1).setFirstName("nhi").setLastName("nguyễn").setClassName("15T3").setBirthday("06/02/1997").setAddress("Đà Nẵng").build();
        //System.out.println(st.toString());
    }
}
