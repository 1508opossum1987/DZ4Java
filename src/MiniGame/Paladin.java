package MiniGame;

public class Paladin extends Character implements Healer, Warrior {//паладин
    //Паладин умеет все, но его способности несколько уменьшены по сравнению с остальными
    //Атакуем врагов, лечим своих или себя
    int damage = this.getLevel()*2;//урон немного меньше чем у рыцаря
   //минимальная способность лечения, 3 очка = 2 урон + 1 лечение

    public Paladin() {
        super();
    }

    public Paladin (String name){
        super(name);
    }

    public Paladin(String name, int hp, int level) {
        super(name, hp, level);
    }

    @Override
    public void attack(Character target) {
        warrior();
        target.takeDamage(damage);
    }

    @Override
    public void healer(Character target) {
        int healAmount = getLevel();
        target.setHp(target.getHp() + healAmount);
        if (target.getHp() > 100) {
            target.setHp(100);
        }
        System.out.println(getName() + " исцеляет " + target.getName() +
                " святым светом! +" + healAmount + " HP");
    }

    @Override
    public void heal(Character target) {
        healer(target); // вызываем метод из интерфейса
    }

    @Override
    public void warrior() {
        System.out.println("Паладин "+getName()+" атакует врукопашную!");
    }

}
