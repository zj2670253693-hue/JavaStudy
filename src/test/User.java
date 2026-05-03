package test;

public class User {
    private String username;
    private String password;
    private String email;
    private String gander;
    private int age;

    public User(){

    }
    public User(String username,String password,String email,String gander,int age){
        this.age = age;
        this.username = username;
        this.password = password;
        this.email = email;
        this.gander = gander;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setGander(String gander) {
        this.gander = gander;
    }
    public String getGander() {
        return gander;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String toString(){
        return "用户名：" + username + "密码：" + password + "邮箱：" + email + "性别：" + gander + "年龄：" + age;
    }
}
