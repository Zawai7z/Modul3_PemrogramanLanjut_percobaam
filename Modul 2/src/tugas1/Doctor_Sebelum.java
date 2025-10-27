package tugas1;

public class Doctor_Sebelum {
    public String name;
    public double salary;

    public void applyBonus() {
        double bonus = salary * 0.1;
        salary = salary + bonus;
        System.out.println("Total Salary (with bonus): " + salary);
    }

    public static void main(String[] args) {
        Doctor_Sebelum d1 = new Doctor_Sebelum();
        d1.name = "Dr. Wildan";
        d1.salary = 8000000;
        d1.applyBonus();
    }
}
