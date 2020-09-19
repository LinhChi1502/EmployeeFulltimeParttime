public class FulltimeEmployee extends Employee{
    private double reward;
    private double fee;
    private double salary;

    public FulltimeEmployee() {

    }

    public FulltimeEmployee(double reward, double fee, double salary) {
        this.reward = reward;
        this.fee = fee;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                this.reward + " " +
                this.fee + " " +
                this.salary;
    }
    @Override
    public double calSalary() {
        return (this.salary + (this.reward - this.fee));
    }
}
