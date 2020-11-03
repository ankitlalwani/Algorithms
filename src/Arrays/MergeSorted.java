package Arrays;

/*
P88 - Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 */
public class MergeSorted {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=m;i<(m+n);i++){
            nums1[i] = nums2[j];
            j++;
        }
        int p=0;
        int r = nums1.length-1;
        QuickSort(nums1,p,r);
    }

    public void QuickSort(int[] nums1,int p,int r){
        if(p<r){
            int q=Partition(nums1, p, r);
            QuickSort(nums1,p,q-1);
            QuickSort(nums1,q+1,r);
        }
    }
    public int Partition(int[] nums1,int p,int r){
        int x=nums1[r];
        int i = p-1;
        for(int j=p;j<r;j++){
            if(nums1[j]<=x){
                i++;
                int swap=nums1[i];
                nums1[i]=nums1[j];
                nums1[j]=swap;
            }
        }
        int swap=nums1[i+1];
        nums1[i+1]=nums1[r];
        nums1[r]=swap;
        return i+1;
    }

    public static void main(String [] args){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m=3, n=3;
        MergeSorted mergeSorted = new MergeSorted();
        mergeSorted.merge(nums1,m,nums2,n);
        System.out.print("new String is: ");
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+ " ");
        }
        System.out.println();
    }
}
