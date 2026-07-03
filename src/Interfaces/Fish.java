package Interfaces;

public class Fish implements Swimmable, Initiable {
    private String name;

    public Fish(){
        name = "unknown";
    }

    public Fish(String name){
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(name+" умеет плавать");
    }

    @Override
    public void init() {
        swim();
    }
}
