

public class Main {


    public static void main(String[] args) throws InterruptedException {
        ClientManager clientManager = new ClientManager();

        JewerelyShop jewerelyShop = new JewerelyShop();

        Thread jewerely = new Thread(jewerelyShop);
        jewerely.start();


        System.out.println("клиенты идут");

    }
}




