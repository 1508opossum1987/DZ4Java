package Transports;

public abstract class Transport {
    protected String model;
    protected int speed;

    public Transport (){
        model = "unknown";
        speed = 1;
    }

    public Transport (String model, int speed){
        this.model = model;
        this.speed = speed;
    }

    public abstract void start();

    public abstract void stop();

    public String getModel(){
        return model;
    }

    public int getSpeed(){
        return speed;
    }

    public void printInfo(){
        System.out.println("Model: "+getModel()+"; speed: "+getSpeed());
        System.out.println();
    }
}
