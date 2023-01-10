package printTillHundred;

public class Client {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            PrintNumber pn = new PrintNumber(i);
            Thread t = new Thread(pn);
            t.start();
        }
    }
}
