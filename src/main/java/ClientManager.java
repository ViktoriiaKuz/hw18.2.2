

public class ClientManager implements Runnable {


    public void run() {



            try {
                Thread.sleep(2000);
                System.out.println( "  клиент зашел в магазин");
                Thread.sleep(4000);
                System.out.println( "  вышел");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



}




