import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        short b;
        short u_0;

        public double f(int x) {
            return 1/(Math.floor(Math.pow(2, b - Math.pow(x, 2)))) * Math.pow(10, 9);
        }

        public double un(int x) {
            if(x == 0){
                return u_0;
            }
            return f(un(--x));
        }

        b = lec.nextShort();
        u_0 = lec.nextShort();
        Integer n = (int) Math.pow(10, 12);
        float ans = un(n) + un(n+1);        
        System.out.println(ans);
    }
}

