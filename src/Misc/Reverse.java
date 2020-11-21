package Misc;
/*
P7: reverse integer.
Given a 32-bit signed integer, reverse digits of an integer.

Note:
Assume we are dealing with an environment that could only
store integers within the 32-bit signed integer range: [−231,  231 − 1].
For the purpose of this problem, assume that your function returns 0 when the
reversed integer overflows.
*/

public class Reverse {

    public int reverse(int x) {

        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }

        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)res;
        }

    }

    public static void main(String [] args){
        int x=123;
        System.out.println("number: "+ x);
        Reverse reverse = new Reverse();
        int result = reverse.reverse(x);
        System.out.println("Result: "+ result);

    }
}
