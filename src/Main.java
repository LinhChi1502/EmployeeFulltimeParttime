public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new FulltimeEmployee(100,50,10);
        employees[0].setName("Chi");
        employees[1] = new FulltimeEmployee(100,50,5);
        employees[1].setName("Duy");
        employees[2] = new ParttimeEmployee(15);
        employees[3] = new ParttimeEmployee(20);

        EmployeeManaging employeeManaging = new EmployeeManaging();
        employeeManaging.getUnderAvgFulltimeList(employees);

        System.out.println("Lương phải trả cho nhân viên bán thời gian: ");
        System.out.println(employeeManaging.calMustPaySalary(employees));

        System.out.println("Sắp xếp nhân viên fulltime theo lương: ");
        System.out.println(employeeManaging.sortFulltimeEmployee(employees));
    }
}
