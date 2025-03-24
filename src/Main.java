public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.createNewEmployee (new Employee ("Иванов", "Иван", "Васильевич", 1000, 1));
        employeeBook.createNewEmployee (new Employee("Петров", "Петр", "Петрович", 1010, 2));
        employeeBook.createNewEmployee (new Employee("Шишкин", "Михаил", "Валентинович", 1100, 4));
        employeeBook.createNewEmployee (new Employee("Травинова", "Ирина", null, 1000, 4));
        employeeBook.createNewEmployee (new Employee("Сидорова", "Кристина", " ", 2000, 1));
        employeeBook.createNewEmployee (new Employee("Тушкевич", "Максим", "", 100, 2));
        employeeBook.createNewEmployee (new Employee("Крутов", "Дмитрий", "Григорьевич", 200, 1));
        employeeBook.createNewEmployee (new Employee("Харитонов", "Илья", "Владимирович", 1, 3));
        employeeBook.createNewEmployee (new Employee("Кругляшова", "Ирина", "Борисовна", 300, 4));

        int dept = 4;
        double percent = 7;
        double value = 500;
        int id = 0;


        System.out.println("Подробный список всех сотрудников:");
        System.out.println("( ID - ФИО - [Отдел] - Зарплата )");
        separator();
        employeeBook.printAllEmployees();
        line();

        if (employeeBook.deleteEmployee(id)) {
            System.out.printf("Сотрудник c индетификатором %d удалён.\n", id);
        }else System.out.printf("Удаление сотрудника с индетификатором %d не удалось.\n", id);
        line();

        System.out.println("Искомый сотрудник: ");
        separator();
        employeeBook.findEmployee(id);
        line();



        System.out.println("Подробный список всех сотрудников:");
        System.out.println("( ID - ФИО - [Отдел] - Зарплата )");
        separator();
        employeeBook.printAllEmployees();
        line();

        employeeBook.getEmployeesSumSalary();
        line();

        System.out.println("Сотрудник с минимальной зарплатой:");
        System.out.println("( ID - ФИО - [Отдел] - Зарплата )");
        separator();
        employeeBook.getEmployeeWithMinSalary();
        line();

        System.out.println("Сотрудник с максимальной зарплатой:");
        System.out.println("( ID - ФИО - [Отдел] - Зарплата )");
        separator();
        employeeBook.getEmployeeWithMaxSalary();
        line();

        employeeBook.getEmployeesAvgSalary();
        line();

        System.out.println("Список всех сотрудников:");
        separator();
        employeeBook.printName();
        line();



        System.out.printf("Индексация зарплат всех сотрудников на %.0f процентов, успешно произведена.\n", percent);
        employeeBook.setEmployeesSalaryIndex(percent);
        line();

        System.out.println("Подробный список всех сотрудников:");
        System.out.println("( ID - ФИО - [Отдел] - Зарплата )");
        separator();
        employeeBook.printAllEmployees();
        line();

        System.out.printf("Сотрудник с минимальной зарплатой в %d отделе:\n", dept);
        System.out.println("( ID - ФИО - Зарплата )");
        separator();
        employeeBook.getDeptEmployeeWithMinSalary(dept);
        line();

        System.out.printf("Сотрудник с максимальной зарплатой в %d отделе:\n", dept);
        System.out.println("( ID - ФИО - Зарплата )");
        separator();
        employeeBook.getDeptEmployeeWithMaxSalary(dept);
        line();

        employeeBook.getDeptEmployeesSumSalary(dept);
        line();

        employeeBook.getDeptEmployeesAvgSalary(dept);
        line();

        System.out.printf("Список сотрудников в %d отделе:\n", dept);
        System.out.println("( ID - ФИО - Зарплата )");
        separator();
        employeeBook.printDeptAll(dept);
        line();

        employeeBook.setDeptEmployeesSalaryIndex(dept, percent);
        System.out.printf("Индексация зарплат сотрудников в %d отделе на %.0f процентов успешно произведена.\n", dept, percent);
        line();

        System.out.printf("Список сотрудников в %d отделе:\n", dept);
        System.out.println("( ID - ФИО - Зарплата )");
        separator();
        employeeBook.printDeptAll(dept);
        line();

        System.out.printf("Список сотрудников с зарплатой меньше чем %.0f ₽\n", value);
        System.out.println("( ID - ФИО - Зарплата )");
        separator();
        employeeBook.getEmployeeSalaryLessValue(value);
        line();

        System.out.printf("Список сотрудников с зарплатой больше чем %.0f ₽\n", value);
        System.out.println("( ID - ФИО - Зарплата )");
        separator();
        employeeBook.getEmployeeSalaryMoreValue(value);
        line();
    }

    public static void separator() {
        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    public static void line(){
        System.out.println();
        System.out.println("====================================================================================================");
        System.out.println();
    }
}