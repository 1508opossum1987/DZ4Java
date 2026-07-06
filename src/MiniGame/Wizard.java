package MiniGame;

public class Wizard extends Character implements Mage {//волшебник
    //Волшебник умеет использовать боевую магию, она развита у него сильнее всех
    int damage = this.getLevel()*3;//3 очка = 3 очка урона боевой магией;

    public Wizard() {
        super();
    }

    public Wizard (String name){
        super(name);
    }

    public Wizard(String name, int hp, int level) {
        super(name, hp, level);
    }

    @Override
    public void attack(Character target) {
        mage();
        target.takeDamage(damage);
    }

    @Override
    public void mage() {
        System.out.println("Волшебник " + getName() + " использует боевую магию!");
    }
}
