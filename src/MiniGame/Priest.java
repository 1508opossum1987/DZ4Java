package MiniGame;

public class Priest extends Character implements Healer, Mage {//монах
    //Монах может атаковать, использовать магию или лечить себя или союзников
    int damage = this.getLevel();
    int health = this.getLevel() * 2;//высокая способность лечить, 3 очка = 1 атака магией + 2 лечение

    public Priest() {
        super();
    }

    public Priest (String name){
        super(name);
    }

    public Priest(String name, int hp, int level) {
        super(name, hp, level);
    }

    @Override
    public void attack() {
        mage();
        takeDamage(damage);
    }

    @Override
    public void healer() {
        heal(health);
    }

    @Override
    public void mage() {
        System.out.println("Монах " + getName() + " использует боевую магию!");
    }
}
