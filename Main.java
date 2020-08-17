public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener onTaskErrorListener = System.out::println;
        Worker worker = new Worker(listener, onTaskErrorListener);

        worker.start();
    }
}
