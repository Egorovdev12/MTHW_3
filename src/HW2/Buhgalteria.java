package HW2;


public class Buhgalteria {

    public void shop(long[] money) {
        long localSum = 0;
        for (long a : money) {
            localSum = localSum + a;
        }
        Homework2.generalAdder.add(localSum);
    }

}