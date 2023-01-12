package printTillHundred;

public class NumberPrinter implements Runnable{
    int toPrint;

    NumberPrinter(int toPrint){
        this.toPrint = toPrint;
    }

    @Override
    public void run() {
        System.out.println("Printing " + this.toPrint + ". Printed by thread" + Thread.currentThread().getName() );
    }
}
