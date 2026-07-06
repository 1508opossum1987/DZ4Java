package MiniGame;

public class Priest extends Character implements Healer, Mage {//монах
    //Монах может атаковать, использовать магию или лечить себя или союзников
    int damage = this.getLevel();
    //высокая способность лечить, 3 очка = 1 атака магией + 2 лечение

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
    public void attack(Character target) {
        mage();
        target.takeDamage(damage);
    }

    @Override
    public void healer(Character target) {
        int healAmount = getLevel() * 2;
        target.setHp(target.getHp() + healAmount);
        if (target.getHp() > 100) {
            target.setHp(100);
        }
        System.out.println(getName() + " исцеляет " + target.getName() +
                " божественной силой! +" + healAmount + " HP");
    }

    @Override
    public void heal(Character target) {
        healer(target); // вызываем метод из интерфейса
    }

    @Override
    public void mage() {
        System.out.println("Монах " + getName() + " использует боевую магию!");
    }
}
