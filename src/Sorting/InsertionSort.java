package Sorting;

/*insertion sort
  Big O time complexity = n2 (n-square)*/

import java.util.Arrays;

public class InsertionSort {

    public int[] insertionsort(int[] A){
        for(int j=1;j<A.length;j++){
            int key = A[j];
            int i=j-1;

            while(i>=0 && A[i]>key){
                A[i+1]=A[i];
                i--;
            }
            A[i+1]=key;
        }
        return A;
    }


    //main to call the sort
    public static void main(String[] args){
        int[] A = {2,1,6,10,22,98,45,78,25,11,7};
        int[] A1 = {5,2,4,6,1,3};

        System.out.println("before insertion sort");

        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+",");
        }
        System.out.println();

        InsertionSort insertionSort = new InsertionSort();
        int[] B = insertionSort.insertionsort(A);

        System.out.println("after insertion sort");

        for (int i=0;i<B.length;i++){
            System.out.print(B[i]+",");
        }
    }
}
