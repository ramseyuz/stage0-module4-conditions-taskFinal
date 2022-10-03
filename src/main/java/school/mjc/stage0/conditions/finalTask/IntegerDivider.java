package school.mjc.stage0.conditions.finalTask;

import static java.lang.Math.abs;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int a;
        if (divider != 0) {
            a = abs(dividend / divider);
            if (divider * a == dividend) {
                System.out.println("can be divided completely");
            } else {
                System.out.println("cannot be divided completely");
            }
        } else {
            System.out.println("division by zero");
        }

    }
}
