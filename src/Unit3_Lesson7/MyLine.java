/*
 * by Alex Lysogora
 * Each line should be prefixed with  * 
 */
package Unit3_Lesson7;

/**
 *
 * @author vbg47
 */
public class MyLine {
    
    class Point {
    public int x;
    public int y;
    }
    
    public Point pointStart;
    public Point pointEnd;
    
    MyLine(int pointStartX, int pointStartY,
            int pointEndX, int pointEndY){
    this.pointStart = new Point();
    this.pointEnd = new Point();
    }
    
    
}
