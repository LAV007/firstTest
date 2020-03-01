package Lesson_3;

public class ArthOprs {
    double d1 = 35.5d;
    double d2 = 36.1d;
    double sum = d1 + d2;
    double min = d1 - d2;
    double um = d1 * d2;
    double del = d1 / d2;
    int in = 8;
    int in2 = in % 3;

    public double incr () {
        d2 += 5;
        return d2++;
    }

    public void outPr () {
        System.out.println(incr() + "\n" + d2 + "\n" + in2 );
    }


}
