package Interfaces;

public class Duck implements Flyable, Swimmable, Initiable{
    private String name;

    public Duck(){
        name = "unknown";
    }

    public Duck(String name){
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name+" умеет летать");
    }

    @Override
    public void swim() {
        System.out.println(name+" умеет плавать");
    }

    @Override
    public void init() {
        fly();
        swim();
    }
}
