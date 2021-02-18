

public class JewerelyShop implements Runnable {
    ClientManager clientManager;

    public JewerelyShop(ClientManager clientManager) {
        this.clientManager = clientManager;
    }


    public void run() {
        System.out.println("открылся магазин");

        while (true) {

            try {


                Thread.sleep(30000);

                System.out.println("перерыв");

                System.out.println("все уходят");

                Thread.sleep(10000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

    }
}
