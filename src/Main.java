class Main {
    public static void main(String[] args) {
        QueueSystem queueSystem = new QueueSystem(100, 100, 2, 1, 10);
        queueSystem.run();
    }
}
