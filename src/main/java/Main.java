import java.util.Random;


public class Main {


    public static void main(String[] args) throws InterruptedException {

        ClientManager clientManager = new ClientManager();

        JewerelyShop jewerelyShop = new JewerelyShop();


        Thread jewerely = new Thread(jewerelyShop);
        jewerely.start();

        while (true) {

                Random number1 = new Random();
                int period = number1.nextInt(5000 - 2000) + 2000;




            for (int i = 1; i < 6; i++) {
                if (jewerelyShop.isOpen) {
                    Thread client = new Thread(clientManager);
                    System.out.println(i + "клиент");
                    client.start();
                    client.sleep(period);

                }
                else {
                    Thread.sleep(5000);
                }

            }
        }
    }
}
//}


