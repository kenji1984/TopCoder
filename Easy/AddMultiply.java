import java.util.Arrays;

public class AddMultiply {
    public static int[] makeExpression(int y){
     	int[] x = new int[3];
        x[0] = ((y * 2) + 2) % 10;
        if(x[0] < 2) x[0] += 10;
        x[1] = ((y * 2) + 2) % 10;
        if(x[1] < 2) x[1] += 10;
        if(Math.abs(x[0] * x[1] - y) < 2) x[1] += 10;
        x[2] = y - (x[0] * x[1]);
        return x;
    }
}