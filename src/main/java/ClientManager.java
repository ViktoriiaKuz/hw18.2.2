import java.util.Random;

public class ClientManager implements Runnable {





    public void run() {



                try {
                    Random number2 = new Random();
                    int timeSpent = number2.nextInt(8000 - 1000) + 1000;
                    System.out.println( "  зашел в магазин");
                    Thread.sleep(timeSpent);
                    System.out.println( "  вышел");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

    }






