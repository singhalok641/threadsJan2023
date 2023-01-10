package HelloWorldPrinter;

public class HelloWorldPrinter implements  Runnable{
    public static void doSomething(){
        System.out.println("do Something. Printed by thread: " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("Hello Scaler. Printed by thread: " + Thread.currentThread().getName());

        doSomething();
    }
}
