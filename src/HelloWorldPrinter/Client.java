package HelloWorldPrinter;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World. Printed by thread: " + Thread.currentThread().getName());

        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread t = new Thread(hwp);
        t.start();

        System.out.println("After thread creation.  Printed by thread: " + Thread.currentThread().getName());
    }
}
