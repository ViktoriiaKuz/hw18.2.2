

public class JewerelyShop implements Runnable {


    boolean isOpen;



        public void run () {
            while (true) {
                isOpen = true;
                System.out.println("открылся магазин");
                try {


                    Thread.sleep(30000);


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                isOpen = false;
                System.out.println("перерыв, все уходят");
                try {

                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        }

    }
