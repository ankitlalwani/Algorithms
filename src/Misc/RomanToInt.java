package Misc;

/*
P13. Roman to Integer
 */

public class RomanToInt {

    public int romanToInt(String s) {
        int sum=0;
        int index = s.length()-1;
        return romanToInt1(s,sum,index);

    }
    public static int romanToInt1(String s, int sum, int index){
        if (s.length()==1||index==0){
            return calculate(s, sum,index);
        }else {
            if (s.length()>1 && index>0){
                sum = romanToInt1(s,sum,index-1);
                sum = sum + calculate(s, sum,index);
            }
            if (index==s.length()-1){
                if (s.contains("IV")){
                    sum = sum -2;
                }if (s.contains("IX")){
                    sum = sum -2;
                } if (s.contains("XL")){
                    sum=sum-20;
                } if (s.contains("XC")){
                    sum = sum-20;
                } if (s.contains("CD")){
                    sum = sum -200;
                } if (s.contains("CM")){
                    sum = sum - 200;
                }
            }
            return sum;
        }

    }
    public static int calculate(String s, int sum, int index){

        if (s.charAt(index) == 'I') {
            sum= 1;
        } else if (s.charAt(index) == 'V') {
            sum= 5;
        }
        else if (s.charAt(index) == 'X') {
            sum= 10;
        }
        else if (s.charAt(index) == 'L') {
            sum= 50;
        }
        else if (s.charAt(index) == 'C') {
            sum= 100;
        }
        else if (s.charAt(index) == 'D') {
            sum= 500;
        } else if (s.charAt(index) == 'M') {
            sum= 1000;
        }
        return sum;
    }

    public static void main(String[] args){
        String s1= "III";
        String s2 = "IV";
        String s3 = "IX";

        RomanToInt romanToInt = new RomanToInt();
        int r1 = romanToInt.romanToInt(s1);
        int r2 = romanToInt.romanToInt(s2);
        int r3 = romanToInt.romanToInt(s3);

        System.out.println("s1: "+s1+" r1: "+ r1);
        System.out.println("s2: "+s2+" r2: "+ r2);
        System.out.println("s3: "+s3+" r3: "+ r3);
    }
}
