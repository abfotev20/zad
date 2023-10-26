import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class zad1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(() -> {
            System.out.println("Задача 1");
        });
        executorService.submit(() -> {
            System.out.println("Задача 2");
        });
        executorService.submit(() -> {
            System.out.println("Задача 3");
        });
        executorService.shutdown();
    }
}