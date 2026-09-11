import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_ex {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(4);

        es.submit(new Print_Task());

        for (int i = 1; i <= 10; i++){
            es.submit(new Number_Task(i));
        }

        es.shutdown();
    }
}
