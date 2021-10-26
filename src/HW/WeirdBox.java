package HW;

import java.util.concurrent.atomic.AtomicBoolean;

class WeirdBox {

    private AtomicBoolean toggle;

    public WeirdBox() {
        // Будем считать, что если тумблер выключен - игрушка закрыта
        toggle = new AtomicBoolean(false);
    }

    public void openTheBox() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.toggle.set(true);
            System.out.println(Thread.currentThread().getName() + " перевел коробку в открытое состояние");
        }
    }

    public void closeTheBox() {
        while (!Thread.currentThread().isInterrupted()) {
            if (this.toggle.get() == true) {
                this.toggle.set(false);
                System.out.println("Кто-то внутри коробки препятствует её открытию");
            }
        }
    }
}