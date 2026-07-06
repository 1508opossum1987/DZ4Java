package MiniGame;

public class Knight extends Character implements Warrior{//рыцарь
    int damage = this.getLevel()*3;//самый большой возможный урон из всех: 3 очка = 3 урон

    public Knight (){
        super();
    }

    public Knight (String name, int hp, int level){
        super (name,hp, level);
    }

    public Knight (String name){
        super(name);
    }

    @Override
    public void attack(Character target) {
        warrior();
        target.takeDamage(damage);
    }

    @Override
    public void warrior() {
        System.out.println("Рыцарь "+getName()+" атакует мечом!");
    }
}
