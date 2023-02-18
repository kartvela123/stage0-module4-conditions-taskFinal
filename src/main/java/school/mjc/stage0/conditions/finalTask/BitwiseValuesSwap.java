package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        if ((first ^ second) == 1){
            System.out.println(second);
            System.out.println(first);
        }
    }
}
