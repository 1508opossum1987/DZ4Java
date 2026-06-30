package Transports;

public class Plane extends Transport{
    public Plane(){
        super();
    }

    public Plane(String model, int speed) {
        super(model, speed);
    }

    @Override
    public void start() {
        System.out.println("Пуск двигателя...");
        System.out.println("Выезд на взлетную полосу...");
        System.out.println("Быстро разгоняемся до "+getSpeed()+" км/ч...");
        System.out.println("Отрыв колес от посадочной полосы...");
        System.out.println();
    }

    @Override
    public void stop() {
        System.out.println("Касание колесами посадочной полосы...");
        System.out.println("Быстро замедляемся с "+getSpeed()+" км/ч...");
        System.out.println("Выезд к месту высадки...");
        System.out.println("Остановка...");
        System.out.println();
    }
}
