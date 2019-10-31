package com.github.ankurpathak.sorting;

public class InsertionSort {

    public void insertionSort(int[] arr){
        int n = arr.length;
        int temp;

        for(int i = 1; i < n; i++){
            int j = i;
            temp = arr[i];
            while(j > 0 && arr[j - 1] > temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }

    void  printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        InsertionSort is =  new InsertionSort();
        is.insertionSort(arr);
        System.out.println("Sorted array");
        is.printArray(arr);
    }
}
