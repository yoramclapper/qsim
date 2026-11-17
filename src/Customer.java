public class Customer {
    private int arrivalTime;
    private int serviceTime;

    public Customer(int arrivalTime, int serviceTime) {
        this.arrivalTime = arrivalTime;
        this.serviceTime = serviceTime;
    }

    public int getArrivalTime() {return arrivalTime;}
    public int getServiceTime() {return serviceTime;}
}
