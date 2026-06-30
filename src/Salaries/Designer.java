package Salaries;

public class Designer extends Employer{
    private double maketBonus;
    private final String position = "Designer";

    public Designer(){
        super();
        maketBonus = 0.0;
    }

    public Designer(String name, double baseSalary, double maketBonus){
        super(name, baseSalary);
        this.maketBonus = maketBonus;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Name: "+name+", position: "+position+", salary: "+ String.format("%.2f", baseSalary+maketBonus));
    }
}
