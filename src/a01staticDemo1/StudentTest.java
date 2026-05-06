package a01staticDemo1;

public class StudentTest {
    public static void main(String[] args){
        Student student = new Student();
        Student.teacherName = "12345678";
        student.setAge(12);
        student.setName("zhangsan");
        student.setGender("男");

        student.study();
        System.out.println(student.toString());

        Student student1 = new Student();
        student1.setAge(12);
        student1.setName("lisi");
        student1.setGender("男");
        System.out.println(student1.toString());
        student1.study();
    }
}
