import java.util.ArrayList;
import java.util.Random;

public class QueueSystem {

    private int time;
    private int timeHorizon;
    private ArrayList<Customer> customerPopulation;
    private ArrayList<Customer> queue;
    public Server[] servers;

    public QueueSystem(int timeHorizon, int popSize, int serversNr, int minServiceTime, int maxServiceTime) {
        this.time = 0;
        this.timeHorizon = timeHorizon;

        this.customerPopulation = new ArrayList<Customer>();
        Random r = new Random();
        for (int i = 0; i < popSize; i++) {
            int randomArrivalTime = r.nextInt(timeHorizon);
            int randomServiceTime = r.nextInt(maxServiceTime) + minServiceTime;
            Customer customer = new Customer(randomArrivalTime, randomServiceTime);
            this.customerPopulation.add(customer);
        }

        this.queue = new ArrayList<Customer>();

        this.servers = new Server[serversNr];
        for (int i = 0; i < this.servers.length; i++) {
            this.servers[i] = new Server();
        }
    }

    public void run() {
        while (this.time < this.timeHorizon) {
            System.out.print(this.time);
            this.time++;

            System.out.print("\n");
        }
    }
}
