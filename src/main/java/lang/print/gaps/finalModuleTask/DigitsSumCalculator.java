package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int q = number;
        int w = number;
        int a = 0;
        for (; w > 0; ) {
            q = w % 10;
            a = a + q;
            w = w / 10;
        }
        System.out.println(a);
    }
}
