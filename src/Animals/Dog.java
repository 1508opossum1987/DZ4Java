package Animals;

public class Dog extends Animal {
    public Dog (String name) {
        super(name);
    }

    @Override
    public void getSound(){
        System.out.println(name +" говорит: гав-гав!");
    }
}
