import java.io.Serializable;

public class EmployeeBean implements Serializable {
    private int id;
    private String name;
    private double monthlySalary;

    public EmployeeBean() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getAnnualSalary() {
        return monthlySalary * 12;
    }
}

class EmpDemo2 {
    public static void main(String[] args) {
        EmployeeBean E = new EmployeeBean();
        E.setId(401);
        E.setName("John Doe");
        E.setMonthlySalary(30000.0);

        System.out.println("Employee ID: " + E.getId());
        System.out.println("Name: " + E.getName());
        System.out.println("Monthly Salary: " + E.getMonthlySalary());
        System.out.println("Annual Salary: " + E.getAnnualSalary());
    }
}