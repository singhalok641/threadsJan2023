package printTillHundred;

public class PrintNumber implements Runnable{
    int toPrint;

    PrintNumber(int toPrint){
        this.toPrint = toPrint;
    }

    @Override
    public void run() {
        System.out.println("Printing " + this.toPrint + ". Printed by thread" + Thread.currentThread().getName() );
    }
}
