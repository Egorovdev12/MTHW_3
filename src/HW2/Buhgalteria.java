package HW2;

import java.util.concurrent.atomic.LongAdder;

public class Buhgalteria {

    public void shop(long[] money, LongAdder adder) {
        long localSum = 0;
        for (long a : money) {
            localSum = localSum + a;
        }
        adder.add(localSum);
    }
}