import java.util.ArrayList;
import java.util.Arrays;

public class QSystem {

    private int time;
    private int timeHorizon;
    private Customer[] customers;
    private ArrayList<Customer> queue;
    private Server[] servers;

    public QSystem(int timeHorizon, int popSize, int serversNr) {
        this.time = 0;
        this.timeHorizon = timeHorizon;

        this.customers = new Customer[popSize];
        for (int i = 0; i < this.customers.length; i++) {
            this.customers[i] = new Customer();
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
