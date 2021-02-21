import java.util.Random;

public class ClientManager implements Runnable {





    public void run() {



                try {
                    System.out.println( "  зашел в магазин");
                    Thread.sleep(8000);
                    System.out.println( "  вышел");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

    }






