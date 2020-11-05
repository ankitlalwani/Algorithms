package Arrays;

/*
P283: Given an array nums, write a function to move
all 0's to the end of it while maintaining the relative
order of the non-zero elements.
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i=0;
        int low=i-1;
        for(i=0;i<nums.length;i++){
            if (nums[i]==0){
            }else{
                low++;
                int swap=nums[low];
                nums[low]=nums[i];
                nums[i]=swap;
            }
        }
    }

    public static void main(String [] args){
        int[] nums = {0,1,0,3,12};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(nums);
        System.out.print("new String is: ");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
    }
}
