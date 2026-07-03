package MiniGame;

public abstract class Character {
    private String name;
    private int hp;
    private int level;

    public Character() {
        name = "unknown";
        hp = 1;
        level = 1;
    }

    public Character(String name, int hp, int level) {
        this.name = name;
        if (hp < 0 || hp > 100) {
            this.hp = 1;
        } else this.hp = hp;
        if (level < 0 || level > 10) {
            this.level = 1;
        } else this.level = level;
    }

    public abstract void attack();

    public void takeDamage() {
        System.out.println(name + " наносит урон");
    }

    public void heal() {
        System.out.println(name + " лечит");
    }

    public void printStats() {
        System.out.println("Имя: " + name + ". Здоровье: " + hp + ". Уровень: " + level + ".");
    }
}
