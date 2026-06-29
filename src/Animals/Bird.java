package Animals;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void getSound() {
        System.out.println(name + " говорит: чирик-чирик!");
    }
}
