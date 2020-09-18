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

    public FulltimeEmployee(String code, String name, int age, String phoneNum, String email, double reward, double fee, double salary) {
        super(code, name, age, phoneNum, email);
        this.reward = reward;
        this.fee = fee;
        this.salary = salary;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
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
