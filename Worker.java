public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallbak;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallbak) {
        this.callback = callback;
        this.errorCallbak = errorCallbak;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallbak.onError("Task " + i + " is error");
            }
            callback.onDone("Task " + i + " is done");
        }
    }
}

