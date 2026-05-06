package a01staticDemo1;

public class Student {
    private String name;
    private int age;
    private String gender;
    public static String teacherName;
    // 表示的是 student所有的对象，都共享一个teacherName

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    // 行为
    public void study(){
        System.out.println(name + "正在学习");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}
