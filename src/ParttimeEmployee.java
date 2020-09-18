public class ParttimeEmployee extends Employee {
    private int workHour;

    public ParttimeEmployee() {

    }

    public ParttimeEmployee(int workHour) {
        this.workHour = workHour;
    }

    public ParttimeEmployee(String code, String name, int age, String phoneNum, String email, int workHour) {
        super(code, name, age, phoneNum, email);
        this.workHour = workHour;
    }

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

    @Override
    public String toString() {
        return super.toString() + " "
                + this.workHour;
    }
    @Override
    public double calSalary() {
        return this.workHour * 1000;
    }
}
