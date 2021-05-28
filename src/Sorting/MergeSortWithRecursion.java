package Sorting;

/*Merge sort with recursion
    Big O Time complexity:
        average: nlog(n)
        worst: nlog(n)  */

public class MergeSortWithRecursion {


    //recursively call merge sort
    public int[] mergeSort(int[] A, int p, int r){
        if(p<r){
            int q= (int) Math.floor((p+r)/2);
            mergeSort(A,p,q);
            mergeSort(A,q+1,r);
            merge(A,p,q,r);
        }
        return A;
    }

    //to merge 2 arrays.
    public void merge(int[] A, int p, int q, int r){
        int n1= q-p+1;
        int n2= r-q;

        int[] L = new int[n1+1];
        int[] R = new int[n2+1];

        for (int i=0;i<n1;i++){
            L[i] = A[p+i];
        }
        for (int j=0;j<n2;j++){
            R[j] = A[q+j+1];
        }
        //placeholder values
        L[n1]=10000;
        R[n2]=10000;
        int i=0;
        int j=0;
        for (int k=p;k<=r;k++){
            if(L[i]<=R[j]){
                A[k]=L[i];
                i++;
            }
            else {
                A[k]=R[j];
                j++;
            }
        }
    }


    //main to call the sort
    public static void main(String[] args){
        int[] A = {2,1,6,10,22,98,45,78,25,11,7};
        int p =0;
        int r= A.length-1;

        System.out.println("before merge sort");

        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+",");
        }
        System.out.println();

        MergeSortWithRecursion mergeSortWithRecursion = new MergeSortWithRecursion();
        int[] B = mergeSortWithRecursion.mergeSort(A,p,r);

        System.out.println("after merge sort");

        for (int i=0;i<B.length;i++){
            System.out.print(B[i]+",");
        }

    }
}
