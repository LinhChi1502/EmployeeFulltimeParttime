public class ParttimeEmployee extends Employee {
    private int workHour;

    public ParttimeEmployee() {

    }

    public ParttimeEmployee(int workHour) {
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
