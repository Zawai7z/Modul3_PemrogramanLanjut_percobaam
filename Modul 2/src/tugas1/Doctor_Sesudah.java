package tugas1;

public class Doctor_Sesudah {
    private String name;
    private double salary;

    // Encapsulate Field
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Extract Method
    public double calculateBonus() {
        return salary * 0.1;
    }

    // Inline Variable
    public void applyBonus() {
        salary = salary + calculateBonus();
        System.out.println("Total Salary (with bonus): " + salary);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

