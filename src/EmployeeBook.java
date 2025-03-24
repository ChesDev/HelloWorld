public class EmployeeBook {
    private final Employee[] employees = new Employee[10];
    private int employeesCount = 0;


    public boolean createNewEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                employeesCount++;
                return true;
            }
        }
        return false;
    }

    public boolean deleteEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                employeesCount--;
                return true;
            }
        }
        return false;
    }

    public void findEmployee(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                System.out.println(employee);
            }
        }
    }

    public void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public void printName() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.printName());
            }
        }
    }

    public void getEmployeeWithMinSalary() {
        double minSalary = 10000000;
        int id = -1;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }

            double salary = employee.getSalary();
            if (salary < minSalary) {
                minSalary = salary;
                id = employee.getId();
            }
        }
        System.out.println(employees[id]);
    }

    public void getEmployeeWithMaxSalary() {
        double maxSalary = -1;
        int id = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }

            double salary = employee.getSalary();
            if (salary > maxSalary) {
                maxSalary = salary;
                id = employee.getId();
            }
        }
        System.out.println(employees[id]);
    }

    public void getEmployeesSumSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        System.out.printf("Сумма затрат на зарплату всех сотрудников равна: %.2f₽ \n", sum);
    }

    public void getEmployeesAvgSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        sum /= employeesCount;
        System.out.printf("Средняя зарплата всех сотрудников равна: %.2f₽ \n", sum);
    }

    public void setEmployeesSalaryIndex(double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                double salary = employee.getSalary();
                double salaryIndex = salary + (salary / 100 * percent);
                employee.setSalary(salaryIndex);
            }
        }
    }

    public void getDeptEmployeeWithMinSalary(int dept) {
        double minSalary = 10000000;
        int id = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDept() == dept) {
                double salary = employee.getSalary();
                if (salary < minSalary) {
                    minSalary = salary;
                    id = employee.getId();
                }
            }
        }
        System.out.printf("%d - %s - %.2f ₽\n", employees[id].getId(), employees[id].printName(), employees[id].getSalary());
    }

    public void getDeptEmployeeWithMaxSalary(int dept) {
        double maxSalary = -1;
        int id = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDept() == dept) {
                double salary = employee.getSalary();
                if (salary > maxSalary) {
                    maxSalary = salary;
                    id = employee.getId();
                }
            }
        }
        System.out.printf("%d - %s - %.2f ₽\n", employees[id].getId(), employees[id].printName(), employees[id].getSalary());
    }

    public void getDeptEmployeesSumSalary(int dept) {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDept() == dept) {
                sum += employee.getSalary();
            }
        }
        System.out.printf("Сумма затрат на зарплату сотрудников в %d отделе равна: %.2f₽\n", dept, sum);
    }

    public void getDeptEmployeesAvgSalary(int dept) {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDept() == dept) {
                sum += employee.getSalary();
            }
        }
        sum /= employeesCount;
        System.out.printf("Средняя сумма затрат на зарплату сотрудников в %d отделе равна: %.2f₽\n", dept, sum);
    }

    public void setDeptEmployeesSalaryIndex(int dept, double percent) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDept() == dept) {
                double salary = employee.getSalary();
                double salaryIndex = salary + (salary / 100 * percent);
                employee.setSalary(salaryIndex);
            }
        }
    }

    public void printDeptAll(int dept) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDept() == dept) {
                System.out.printf("%d - %s - %.2f ₽\n", employee.getId(), employee.printName(), employee.getSalary());
            }
        }
    }

    public void getEmployeeSalaryLessValue(double value) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < value) {
                System.out.printf("%d - %s - %.2f ₽\n", employee.getId(), employee.printName(), employee.getSalary());
            }
        }
    }

    public void getEmployeeSalaryMoreValue(double value) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > value) {
                System.out.printf("%d - %s - %.2f ₽\n", employee.getId(), employee.printName(), employee.getSalary());
            }
        }
    }
}
