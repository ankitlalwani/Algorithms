package Arrays;
/*
238. Product of Array Except Self
Given an array nums of n integers where n > 1,
return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
Example:
Input:  [1,2,3,4]
Output: [24,12,8,6]
Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.
Note: Please solve it without division and in O(n).
Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
 */
public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int multiplybwd=1;

        multiplybwd=productexceptselfRec(nums,result,nums.length-1, multiplybwd);
        boolean containZero=false;
        int count=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                containZero=true;
                count++;
            }
        }
        if (containZero){
            for (int i=0;i<nums.length;i++){
                if (nums[i]==0 & count==1) {
                    result[i] = multiplybwd;
                }else {
                    result[i]=0;
                }
            }
        }

        return result;

    }
    public int productexceptselfRec(int[] nums, int[] result, int n, int multiplybwd){
        if (n==0){
            result[0]=multiplybwd;
            if (nums[0]==0){
                return multiplybwd;
            }else {
                return nums[0]*multiplybwd;
            }

        }else {
            if (nums[n]!=0) {
                multiplybwd = multiplybwd * nums[n];
                multiplybwd = productexceptselfRec(nums, result, n - 1, multiplybwd);
                result[n] = multiplybwd / nums[n];
                return multiplybwd;
            }else {
                multiplybwd = productexceptselfRec(nums, result, n - 1, multiplybwd);
                result[n]=multiplybwd;
                return multiplybwd;
            }
        }
    }

    public static void main(String [] args){
        int[] nums = {1,2,3,4};
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        int[] result =  productExceptSelf.productExceptSelf(nums);
        System.out.print("new String is: ");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+ " ");
        }
        System.out.println();
    }
}
