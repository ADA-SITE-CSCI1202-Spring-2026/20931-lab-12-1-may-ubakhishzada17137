public class ThreadLambdaTask {
    public static void main(String[] args) {
    // ===== TODO 1 =====
    // Create a thread using lambda.

    Thread t = new Thread(() -> {
        for (int i = 1; i<=5; i++){
            System.out.println(i);
        }
    });

    // It should print numbers from 1 to 5.
    // ===== TODO 2 =====
    // Start the thread.

    t.start();

    System.out.println("Main method finished.");
}
}