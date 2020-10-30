package Arrays;

public class RemoveElement {

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
