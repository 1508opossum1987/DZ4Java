package MiniGame;

public abstract class Character {
    private String name;
    private int hp;
    private int level;

    public Character() {
        name = "unknown";
        hp = 100;//изначально должно быть 100 hp
        level = 1;//по умолчанию 1 уровень
    }

    public Character (String name){//частный случай перегрузки, когда в начале игры создаются только имена героев
        this.name = name;
        hp = 100;//изначально должно быть 100 hp
        level = 1;//по умолчанию 1 уровень
    }

    public Character(String name, int hp, int level) {
        this.name = name;
        if (hp < 1 || hp > 100) {
            this.hp = 100;
        } else this.hp = hp;
        if (level < 1 || level > 10) {//уровень не может быть больше 10 и меньше 1
            this.level = 1;
        } else this.level = level;
    }

    public String getName() {
        return this.name;
    }

    public int getLevel() {
        return this.level;
    }

    public int getHp() {
        return this.hp;
    }

    public abstract void attack();

    public void takeDamage(int damage) {//вызывается у цели
        hp -= damage;
        if (hp < 0) hp = 0;
        System.out.println(name + " получает " + damage + " урона. Осталось HP: " + hp);
    }

    public void heal(int health) {//вызывается у цели
        hp += health;
        if (hp > 100) hp = 100;
        System.out.println(name + " получает " + health + " очков здоровья. Осталось HP: " + hp);
    }

    public void printStats() {
        System.out.println("Имя: " + name + ". Здоровье: " + hp + ". Уровень: " + level + ".");
    }
}
