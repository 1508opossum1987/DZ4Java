package Transports;

public class Boat extends Transport{
    public Boat(){
        super();
    }

    public Boat(String model, int speed) {
        super(model, speed);
    }

    @Override
    public void start() {
        System.out.println("Пуск двигателя...");
        System.out.println("Медленно разгоняемся до "+getSpeed()+" км/ч...");
        System.out.println("Не спеша плывем по реке...");
        System.out.println();
    }

    @Override
    public void stop() {
        System.out.println("Медленно замедляемся с "+getSpeed()+" км/ч...");
        System.out.println("Подплываем к месту стоянки...");
        System.out.println("Остановка...");
        System.out.println();
    }
}
