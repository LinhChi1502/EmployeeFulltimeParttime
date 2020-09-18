public abstract class Employee {
    private String code;
    private String name;
    private int age;
    private String phoneNum;
    private String email;
    public Employee() {

    }

    public Employee(String code, String name, int age, String phoneNum, String email) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return this.code + " "
                + this.name + " "
                + this.age + " "
                + this.phoneNum + " "
                + this.email;
    }
    public abstract double calSalary();
}
