package Interfaces;

public class Airplane implements Drivable, Flyable, Initiable{
    private String name;

    public Airplane(){
        name = "unknown";
    }

    public Airplane(String name){
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println(name+" управляется человеком");
    }

    @Override
    public void fly() {
        System.out.println(name+" может летать");
    }

    @Override
    public void init() {
        drive();
        fly();
    }
}
