package Arrays;

public class RemoveElement {
/*
P27: Given an array nums and a value val, remove all instances of that value in-place and
return the new length.
Do not allocate extra space for another array, you must do this by
modifying the input array in-place with O(1) extra memory.
The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
    public int removeElement(int[] nums, int val) {
        int j=0;
        int k=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[j]==val){
                int x=nums[j];
                nums[j]=nums[k];
                nums[k]=x;
                k--;
            }else{
                j++;
            }

        }
        return j;
    }

    public static void main(String[] args){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int val=3;
        RemoveElement rm = new RemoveElement();
        int length = rm.removeElement(nums,val);
        System.out.print("new String is: ");
        for(int i=0;i<length;i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
        System.out.println("length of new string is: "+ length);
    }
}
