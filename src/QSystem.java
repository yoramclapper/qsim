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

    private void handleNextEvent() {
        // getTimeToCompletion
        // getTimeToArrival
        // if timeToCompletion < timeToArrival
        //     if queue is nonempty:
        //         pop customer from queue
        //         renew timeToCompletion
        //     else
        //        set server to idle
        // else
        //     move customer from customers to queue
        // update time
    }

    public void run() {
        while (this.time < this.timeHorizon) {
            // handleNextEvent();
        }
    }
}
