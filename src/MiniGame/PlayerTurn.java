package MiniGame;

public class PlayerTurn {
    Character[] playerArmy;

    public static void turn(Character[] playerArmy) {
        for (Character p : playerArmy) {
            if (p.getHp() <= 0) {
                System.out.println("Нет живых игроков!");
            } else {
                p.printStats();
            }
        }
    }


}
