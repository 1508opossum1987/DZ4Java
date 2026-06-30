package Transports;

public class Car extends Transport {
    public Car(){
        super();
    }

    public Car(String model, int speed) {
        super(model, speed);
    }

    @Override
    public void start() {
        System.out.println("Пуск двигателя...");
        System.out.println("Быстро разгоняемся до "+getSpeed()+" км/ч...");
        System.out.println();
    }

    @Override
    public void stop() {
        System.out.println("Быстро замедляемся со "+getSpeed()+" км/ч...");
        System.out.println("Остановка...");
        System.out.println();
    }
}
