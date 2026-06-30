package Salaries;

public abstract class Employer {
    protected String name;
    protected double baseSalary;

    public Employer() {
        name = "unknown";
        baseSalary = 1000.00;
    }

    public Employer(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract void calculateSalary();
}
