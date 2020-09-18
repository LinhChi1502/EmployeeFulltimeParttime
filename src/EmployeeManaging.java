public class EmployeeManaging {
    public double calAvgSalary(Employee[] employees) {
        double totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            totalSalary += employees[i].calSalary();
        }
        return totalSalary / employees.length;
    }

    public void getUnderAvgFulltimeList(Employee[] employees) {
        double average = calAvgSalary(employees);
        System.out.println("Danh sách nhân viên fulltime có lương thấp hơn trung bình: ");
        for (Employee employee : employees) {
            if (employee instanceof FulltimeEmployee) {
                if (employee.calSalary() < average) {
                    System.out.println(employee.getName());
                }
            }
        }
    }

    public double calMustPaySalary(Employee[] employees) {
        double mustPaySalary = 0;
        for (Employee employee : employees) {
            if (employee instanceof ParttimeEmployee) {
                mustPaySalary += employee.calSalary();
            }
        }
        return mustPaySalary;
    }

    public String sortFulltimeEmployee(Employee[] employees) {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].calSalary() > employees[j].calSalary()) {
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        String string = "";
        for (Employee employee: employees) {
            if (employee instanceof FulltimeEmployee) {
                string += employee.getName() + " ";
            }
        }
        return string;
    }
}


