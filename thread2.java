import java.util.Scanner;

class FibonacciRunnable implements Runnable {
    private int count;

    public FibonacciRunnable(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        int a = 0, b = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < count; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}

class EvenNumberRunnable implements Runnable {
    private int end;

    public EvenNumberRunnable(int end) {
        this.end = end;
    }

    @Override
    public void run() {
        System.out.println("Even Numbers from 1 to " + end + ":");
        for (int i = 1; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class thread2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a limit: ");
        int limit = scanner.nextInt();

        Runnable fibRunnable = new FibonacciRunnable(limit);
        Runnable evenRunnable = new EvenNumberRunnable(limit);

        Thread fibThread = new Thread(fibRunnable);
        Thread evenThread = new Thread(evenRunnable);

        fibThread.start();
        evenThread.start();
    }
}

