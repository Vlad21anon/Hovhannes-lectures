package lecturesHomework.L23.E2;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[3];
        Fabric fabric = new Fabric();
        workers[0] = fabric.offer(600,1);
        workers[1] = fabric.offer(1200,2);
        workers[2] = fabric.offer(3700,7);

        for (Worker worker: workers) {
            print(worker.toString());
        }
    }
    public static void print(String text) {
        System.out.println(text);
    }
}
