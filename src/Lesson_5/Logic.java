package Lesson_5;

public class Logic {

    boolean b_1 = true;
    boolean b_2 = false;
    boolean b_3 = false;

    boolean res_1 = b_1 && !b_3;
    boolean res_2 = b_2 || b_3;
    boolean res_3 = b_1 ^ b_2;

    public void OutPrint () {
        System.out.println(res_1 + "\n" +
                            res_2 + "\n" +
                            res_3 + "\n");
    }
}
