/**
 * Ситуация "клиент заходит, уходит, и только потом заходит новый"
 * возникает из-за того что в JewelryShop в методе run у clientManager
 * вызывается метод run. Сам по себе метод run не работает в другом потоке.
 * Чтобы метод run выполнился в другом потоке, нужно создать Thread,
 * передать ему объект Runnable и вызвать у Thread метод start.
 * У вас по коду получается так что метод clientManager.run вызывается последовательно в цикле
 * Не создавайте ClientManager в JewelryShop, он уже создан в Main.
 * Передайте менеджера в магазин через конструктор
 */

public class Main {


    public static void main(String[] args) {

        ClientManager clientManager = new ClientManager();
        JewerelyShop jewerelyShop = new JewerelyShop(clientManager);


        Thread jewerely = new Thread(jewerelyShop);
        jewerely.start();

        for (int i = 1; i < 6; i++) {
            Thread client = new Thread(clientManager);
            client.start();
        }

        System.out.println("клиенты идут");

    }
}




