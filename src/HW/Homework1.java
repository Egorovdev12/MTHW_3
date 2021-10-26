package HW;

class Homework1 {

    public static void main(String[] args) throws InterruptedException {

        WeirdBox weirdBox = new WeirdBox();

        Thread threadUser = new Thread(null, weirdBox::openTheBox, "Пользователь");
        Thread threadToy = new Thread(null, weirdBox::closeTheBox, "Странная коробка");
        threadUser.start();
        threadToy.start();


        threadUser.join();

        if (!threadUser.isAlive()) {
            threadToy.interrupt(); //
        }
    }
}
