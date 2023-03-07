package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int q = number;
        int w = number;
        for (; w > 0; ) {
            q = w % 10;
            System.out.print(q);
            w = w/10;
        }
    }
}
