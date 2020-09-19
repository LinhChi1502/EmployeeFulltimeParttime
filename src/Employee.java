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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
