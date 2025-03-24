import java.util.Objects;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private double salary;
    private int dept;
    static final int minDept = 1;
    static final int maxDept = 5;
    private static int count = 0;
    private final int id;

    public Employee(String firstName, String lastName, String middleName, double salary, int dept) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.salary = salary;
        this.id = count++;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public double getSalary() {
        return salary;
    }

    public int getDept() {
        return dept;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public String printName() {
        if (middleName == null || middleName.isEmpty() || middleName.equals(" ")) {
            return firstName + " " + lastName;
        }
        return firstName + " " + lastName + " " + middleName;
    }

    @Override
    public String toString() {
        if (middleName == null || middleName.isEmpty() || middleName.equals(" ")) {
            return String.format("%d - %s %s - [%d] - %.2f ₽", id, firstName, lastName, dept, salary);
        }
        return String.format("%d - %s %s %s - [%d] - %.2f ₽", id, firstName, lastName, middleName, dept, salary);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && dept == employee.dept && id == employee.id && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(middleName, employee.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, middleName, salary, dept, id);
    }
}
