package Salaries;

public class Programmer extends Employer{

    private double projectBonus;
    private final String position = "Programmer";

    public Programmer(){
        super();
        projectBonus = 0.0;
    }

    public Programmer(String name, double baseSalary, double projectBonus){
        super(name, baseSalary);
        this.projectBonus = projectBonus;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Name: "+name+", position: "+position+", salary: "+ String.format("%.2f", baseSalary+projectBonus));
    }
}
