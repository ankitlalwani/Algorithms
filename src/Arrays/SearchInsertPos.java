package Arrays;

public class SearchInsertPos {
    public int searchInsert(int[] nums, int target) {
        int i;
        for(i=0;i<nums.length;i++){
            if (nums[i]==target){
                return i;
            }if(nums[i]>target){
                return i;
            }
        }
        return i;
    }

    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        int val=3;
        SearchInsertPos rm = new SearchInsertPos();
        int position = rm.searchInsert(nums,val);

        System.out.println("Position of target value is: "+ position);
    }
}
