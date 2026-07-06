package MiniGame;

public class Paladin extends Character implements Healer, Warrior {//паладин
    //Паладин умеет все, но его способности несколько уменьшены по сравнению с остальными
    //Атакуем врагов, лечим своих или себя
    int damage = this.getLevel()*2;//урон немного меньше чем у рыцаря
    int health = this.getLevel();//минимальная способность лечения, 3 очка = 2 урон + 1 лечение

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
    public void attack() {
        warrior();
        takeDamage(damage);
    }

    @Override
    public void healer() {
        heal(health);
    }

    @Override
    public void warrior() {
        System.out.println("Паладин "+getName()+" атакует врукопашную!");
    }

}
