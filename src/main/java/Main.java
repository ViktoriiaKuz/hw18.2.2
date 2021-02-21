import java.util.Random;

/**
 * В городе успешно работает ювелирный магазин,
 * так как к магазину постоянно приходят клиенты.
 * Из-за карантина в магазине не может одновременно находится больше 5 клиентов.
 * Клиенты прохотят мимо магазина 1 раз в 2-5 секунд и заходят в магазин
 * если он открыт и в нем есть место. Иначе клиент уходит.
 * Магазин закрывается на 10-секундный перерыв один раз в 30 секунд.
 * В перерыв все клиенты выходят из магазина и новые не могут зайти.
 * Каждый клиент находится в магазине в промежутке от 1 до 8 секунд.
 * <p>
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


    public static void main(String[] args) throws InterruptedException {

        ClientManager clientManager = new ClientManager();

        JewerelyShop jewerelyShop = new JewerelyShop();


        Thread jewerely = new Thread(jewerelyShop);
        jewerely.start();

        while (true) {

            for (int i = 1; i < 6; i++) {
                if (jewerelyShop.isOpen) {
                    Thread client = new Thread(clientManager);
                    System.out.println(i + "клиент");
                    client.start();
                    Thread.sleep(5000);

                }
                else {
                    Thread.sleep(5000);
                }

            }
        }
    }
}
//}


