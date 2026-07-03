package Interfaces;

public class AmphibiousCar implements Drivable, Flyable, Swimmable, Initiable{
    private String name;

    public AmphibiousCar(){
        name = "unknown";
    }

    public AmphibiousCar(String name){
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
    public void swim() {
        System.out.println(name+" может плавать");
    }

    @Override
    public void init() {
        drive();
        fly();
        swim();
    }
}
