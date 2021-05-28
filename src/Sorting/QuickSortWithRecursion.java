package Sorting;

/*Quick sort with recursion
    Big O Time complexity:
        average: nlog(n)
        worst: n-square  */

public class QuickSortWithRecursion {


    public int[] quickSort(int[] A, int p, int r){

        if (p<r){
            int q= findPivot(A,p,r);
            quickSort(A,p,q-1);
            quickSort(A,q+1,r);
        }

        return A;
    }

    public int findPivot(int[] A, int p, int r){
        int key = A[r];
        int i=p-1;

        for (int j=p;j<r;j++){
            if(A[j]<=key){
                int k=A[i+1];
                A[i+1]=A[j];
                A[j]=k;
                i++;
            }
        }
        int k=A[i+1];
        A[i+1] = A[r];
        A[r]=k;
        return i+1;
    }

    //main to call the sort
    public static void main(String[] args){
        int[] A = {2,1,6,10,22,98,45,78,25,11,7};
        int p =0;
        int r= A.length-1;

        System.out.println("before quick sort");

        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+",");
        }
        System.out.println();

        QuickSortWithRecursion quickSortWithRecursion = new QuickSortWithRecursion();
        int[] B = quickSortWithRecursion.quickSort(A,p,r);

        System.out.println("after quick sort");

        for (int i=0;i<B.length;i++){
            System.out.print(B[i]+",");
        }

    }
}
