package MiniGame;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Battle {
    private Character[] playerArmy;
    private Character[] botArmy;
    private Scanner console;

    public Battle(Character[] playerArmy, Character[] botArmy) {
        this.playerArmy = playerArmy;
        this.botArmy = botArmy;
        Scanner console = new Scanner(System.in);
    }

    public void startBattle() {
        while (!isBattleOver()) {
            showStats();
            playerTurn();
            isBattleOver();
            botTurn();
            isBattleOver();
        }
    }

    private void playerTurn() {
        for (Character p : playerArmy) {
            if (p.isAlive()) {
                p.printStats();
                if (p.canHeal()) {
                    boolean flag = true;
                    while (flag) {
                        System.out.println("Введите действие: 1 - атаковать, 2 - лечить ");
                        int choice = console.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("Выберите цель для атаки: ");
                                printAliveList(botArmy);
                                Character target = chooseTarget(botArmy);
                                p.attack(target);
                                flag = false;
                                break;
                            case 2:
                                System.out.println("Выберите цель для лечения:");
                                printAliveList(playerArmy);
                                Character healTarget = chooseTarget(playerArmy);
                                p.heal(healTarget);
                                flag = false;
                                break;
                            default:
                                System.out.println("Введено неверное значение, поеробуйте еще!");
                        }
                    }
                } else {
                    System.out.println("Выберите цель для атаки:");
                    printAliveList(botArmy);
                    Character target = chooseTarget(botArmy);
                    p.attack(target);
                }
            }
        }
    }

    private void botTurn() {
        for (Character b : botArmy) {
            if (b.isAlive()) {
                b.printStats();
                if (b.getHp() <= 30 && b.canHeal()) {
                    Character healTarget = getLowestHpTarget(botArmy);
                    b.heal(healTarget);
                } else {
                    Character target = getRandomTarget(playerArmy);
                    b.attack(target);
                }
            }
        }
    }

    private void showStats() {
        System.out.println("===Промежуточные итоги==");
        System.out.println("Армия игрока: ");
        printAliveList(playerArmy);
        System.out.println("Армия бота: ");
        printAliveList(botArmy);
    }

    private boolean isBattleOver() {
        if (getAliveCount(playerArmy) == 0) {
            System.out.println("Вы проиграли...");
            return true;
        } else if (getAliveCount(botArmy) == 0) {
            System.out.println("Вы победили!");
            return true;
        } else
            return false;
    }

    private Character chooseTarget(Character[] army) {
        printAliveList(army);

        int aliveCount = getAliveCount(army);

        if (aliveCount == 0) {
            System.out.println("Нет живых целей!");
            return null;
        }

        int choice = -1;
        boolean valid = false;

        while (!valid) {
            System.out.print("Введите номер цели (1-" + aliveCount + "): ");

            if (console.hasNextInt()) {
                choice = console.nextInt();

                if (choice >= 1 && choice <= aliveCount) {
                    valid = true;
                } else {
                    System.out.println("Ошибка! Введите число от 1 до " + aliveCount);
                }
            } else {
                System.out.println("Ошибка! Введите целое число!");
                console.next();
            }
        }

        int index = 1;
        for (int i = 0; i < army.length; i++) {
            if (army[i].isAlive()) {
                if (index == choice) {
                    return army[i];
                }
                index++;
            }
        }
        return null;
    }
}

private Character getRandomTarget(Character[] army) {
    while (true) {
        Random random = new Random();
        int randomTarget = random.nextInt(army.length);
        if (army[randomTarget].isAlive()) {
            return army[randomTarget];
        }
    }
}

private Character getLowestHpTarget(Character[] army) {
    Character lowestHpCharacter = null;

    for (Character c : army) {
        if (c.isAlive()) {
            if (lowestHpCharacter == null || c.getHp() < lowestHpCharacter.getHp()) {
                lowestHpCharacter = c;
            }
        }
    }

    return lowestHpCharacter;
}

private int getAliveCount(Character[] army) {
    int count = 0;
    for (Character c : army) {
        if (c.isAlive()) {
            count++;
        }
    }
    return count;
}

void printAliveList(Character[] army) {
    int index = 1;
    for (int i = 0; i < army.length; i++) {
        if (army[i].isAlive()) {
            System.out.println(index + ". " + army[i].getName() +
                    " (HP: " + army[i].getHp() + ")");
            index++;
        }
    }
}

