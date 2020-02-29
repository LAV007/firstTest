/*
 * by Alex Lysogora
 * Each line should be prefixed with  * 
 */
package Lesson_13_ManyArray;

/**
 *
 * @author vbg47
 */
public class ManyArr {
    public void manyArray () {
    int[] [] arr = {{2, 6}, {4, 5, 6}};
    int res = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++){
        res = res + arr[i][j];
        } 
    }
    System.out.println(res);
    
    int[] arr_two = new int[2];
    /*arr_two[0] = arr[0][0] + arr[0][1];
    arr_two[1] = arr[1][0] + arr[0][1] + arr[1][2];
*/
    
    for (int x = 0; x < arr_two.length; x++){        
        arr_two[x] = arr[x][x] + arr[x++][x];
        //arr_two[x++] = arr[x++][x] + arr[x][x++] + arr[x++][x+2];
        }    
    /*
    a[0][0]=2
    a[0][1]=6
    
    a[1][0]=4
    a[1][1]=5
    a[1][2]=6
    
    at[0]=a[0][0]+[1][0]=2+6=8
    */
    //}
    System.out.println(arr_two[0] + " " + arr_two[1]);
    }
    
}
