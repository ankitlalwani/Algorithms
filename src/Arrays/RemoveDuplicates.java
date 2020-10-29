package Arrays;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length==1){
            return 1;
        }else if (nums.length>0){
            int i;
            int j=1;
            for(i=0;i<nums.length-1;i++){
                if(nums[j-1]==nums[j]){
                    int x=nums[j];
                    for(int k=j;k<nums.length-1;k++){
                        nums[k]=nums[k+1];
                    }
                    nums[nums.length-1]=x;
                }else if (nums[j-1]<nums[j]){
                    j++;
                }
            }
            return j;
        }
        else return 0;
    }

    public static void main(String [] args){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicates rm = new RemoveDuplicates();
        int length = rm.removeDuplicates(nums);
        System.out.print("new String is: ");
        for(int i=0;i<length;i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
        System.out.println("length of new string is: "+ length);
    }
}
