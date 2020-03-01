package Lesson_6;

public class BitOper {

    int a = 5;
    int b = 10;

    String str_1 = Integer.toBinaryString(a);
    String str_2 = Integer.toBinaryString(b);

    int and = a & b;
    int or = a | b;
    int com_2 = a ^ b;

    int t = ~a;
    int b_r = b>>1;
    int b_l = b<<1;

    public void outPrint () {
        System.out.println(str_1 + "\n" +
                            str_2 + "\n");

        System.out.println(and + "\n" +
                            or + "\n" +
                            com_2 + "\n");

        System.out.println(t + "\n" +
                            b_r + "\n" +
                            b_l);
    }
}
