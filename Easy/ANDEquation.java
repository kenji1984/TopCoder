/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package andequation;

/**
 *
 * @author kenbui
 */
public class ANDEquation{
    public static int restoreY(int[] A){
        if(A.length <= 2) return -1;
        int y = -1; //-1 is 0xffffffff
        for(int i = 0; i < A.length; i++){
        	for(int j = 0; j < A.length; j++){
                if(j != i) {
                    y &= A[j]; //and every element that's not A[i]
                }
            }
            if(y == A[i]) {
                return A[i];
            }
        }
        return -1;
    }
}
    

