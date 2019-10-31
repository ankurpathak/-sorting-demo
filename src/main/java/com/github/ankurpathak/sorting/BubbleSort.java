package com.github.ankurpathak.sorting;

public class BubbleSort {

    public void bubbleSort(int[] arr){
        int n = arr.length;
        int temp;
        boolean swapped;
        for(int i= 0; i < n-1; i++){
            swapped = false;
            for(int j=0; j < n - 1 - i; j++){
                if(arr[j] > arr [j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
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
        BubbleSort ob =  new BubbleSort();
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
