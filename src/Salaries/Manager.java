package Salaries;

public class Manager extends Employer{
    private double sealedBonus;
    private final String position = "Manager";

    public Manager(){
        super();
        sealedBonus = 0.0;
    }

    public Manager(String name, double baseSalary, double sealedBonus){
        super(name, baseSalary);
        this.sealedBonus = sealedBonus;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Name: "+name+", position: "+position+", salary: "+ String.format("%.2f", baseSalary+sealedBonus));
    }
}
