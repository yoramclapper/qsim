class Main {
    public static void main(String[] args) {
        int timeHorizon = 100;
        int popSize = 100;
        int serversNr = 1;
        QSystem qSystem = new QSystem(timeHorizon, popSize, serversNr);
        qSystem.run();
    }
}
