package Arrays;
/*
P66 - Given a non-empty array of digits representing a non-negative integer,
increment one to the integer.
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        int i = digits.length-1;
        digits = plusOnerec(digits,i);
        return digits;
    }
    public int[] plusOnerec(int[] digits, int i){
        if (digits[i]!=9){
            digits[i]=digits[i]+1;
            return digits;
        }else if (i==0 && digits[i]==9){
            int[] newDigits = new int[digits.length+1];
            for (int j=0;j<digits.length;j++){
                digits[j]=newDigits[j+1];
            }
            newDigits[0]=1;

            return newDigits;
        }else {
            digits[i]=0;
            digits = plusOnerec(digits,i-1);
            return digits;
        }
    }
    public static void main(String [] args){
        int[] nums = {1,2,3};
        PlusOne plusOne = new PlusOne();
        int[] newArray = plusOne.plusOne(nums);
        System.out.print("new String is: ");
        for(int i=0;i<newArray.length;i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
    }
}
