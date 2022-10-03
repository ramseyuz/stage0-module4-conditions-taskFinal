package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        first = first ^ second; // x now becomes 15 (1111)
        second = first ^ second; // y becomes 10 (1010)
        first = first ^ second; // x becomes 5 (0101)
        System.out.println(first);
        System.out.println(second);
    }
}
