

public class JewerelyShop implements Runnable {
    ClientManager clientManager = new ClientManager();



    public void run() {
        System.out.println("открылся магазин");

        while (true) {

            try {
                for (int i = 1; i < 6; i++) {
                    clientManager.run();
                }

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
