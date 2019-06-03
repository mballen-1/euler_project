
// This codes throws nicely an stack overflow exception. Working on that later! :P
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    short b;
    short u_0;

    public double f(double x) {
        return 1/(Math.floor(Math.pow(2, this.b - Math.pow(x, 2)))) * Math.pow(10, 9);
    }

    public double un(double x) {
        if(x == 0){
            return this.u_0;
        }
        return f(un(--x));
    }

    public static void main(String[] args) {
        Solution x = new Solution();
        Scanner lec = new Scanner(System.in);
        x.b = lec.nextShort();
        x.u_0 = lec.nextShort();
        float n = (int) Math.pow(10, 12);
        double ans = x.un(n) + x.un(n+1);        
        System.out.println(ans);
    }
}

