package HW2;

import java.util.concurrent.atomic.LongAdder;

public class Homework2 {

    private static long gain1[] = new long[] {10, 20, 350, 77, 985, 5515, 368, 440, 520, 1280, 3400, 390, 580};
    private static long gain2[] = new long[] {101, 205, 35, 999, 600, 4300, 881, 257};
    private static long gain3[] = new long[] {111, 252, 734, 500, 42, 8100, 12134, 900, 130};

    public static void main(String[] args) throws InterruptedException {

        Buhgalteria buhgalteria = new Buhgalteria();
        LongAdder generalAdder = new LongAdder();

        Thread thread1 = new Thread(null, () -> buhgalteria.shop(gain1, generalAdder), "Магазин №1"); thread1.start();
        Thread thread2 = new Thread(null, () -> buhgalteria.shop(gain2, generalAdder), "Магазин №2"); thread2.start();
        Thread thread3 = new Thread(null, () -> buhgalteria.shop(gain3, generalAdder), "Магазин №3"); thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println("Выручка со всех магазинов: " + generalAdder);
    }
}