package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
     int q = number;
        int w = number;
        String s = "";
        for (; w > 0; ) {
             q = w % 10;
            s = s + String.valueOf(q);
            w = w/10;
        }
        System.out.println(s);
    }
}
