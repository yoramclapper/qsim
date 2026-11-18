import java.util.Random;

public class Customer {
    private int arrivalTime;
    private int serviceTime;

    public Customer() {
        this.arrivalTime = generateArrivalTime();
        this.serviceTime = generateServiceTime();
    }

    public int getArrivalTime() {return arrivalTime;}
    public int getServiceTime() {return serviceTime;}

    private int generateArrivalTime() {
        Random r = new Random();
        return r.nextInt(100);
    }
    private int generateServiceTime() {
        Random r = new Random();
        return r.nextInt(100);
    }
}
