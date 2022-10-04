package ca.sait.Manager;

import ca.sait.ProblemDomain.*;

public class AllSorts {
    
    public void SelectionSort(Shape[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[maxElementIndex] < arr[j]) {
                    maxElementIndex = j;
                }
            }

            if (maxElementIndex != i) {
                int temp = arr[i];
                arr[i] = arr[maxElementIndex];
                arr[maxElementIndex] = temp;
            }
        }

    }

    public void BubbleSort(Shape[] arr) {

    }

    public void InserttionSort(Shape[] arr) {

    }

    public void Merge(Shape arr[], int left, int middle, int right) {
        int low = middle - left + 1; //size of the left Subarray
        int high = right - middle;  //Size of the right Subarray

        Shape L[] = new Shape[low];    //create left and right subarray
        Shape R[] = new Shape[high];

        int i = 0, j = 0;

        for (i = 0; i < low; i++) {  //gets elements into left subarray
            L[i] = arr[left + 1];
        }
        for (j = 0; j < high; j++) { //gets elements into right subbarray
            R[j] = arr[middle + 1 + j];
        }
        int k = left;  //strarting index for sort
        i = 0;  //reset loop variables before merge
        j = 0;

        while (i < low && j < high) {  //mergre left and right subarrays
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < low) { //merge remaining elements from left sub arr
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    void MergeSort(Shape arr[], int left, int right) { //helper function creates sorting sub cases
        int middle;
        if (left < right) { //only sort if the left index is less than right
            middle = (left + right) / 2;

            MergeSort(arr, left, middle);  //left subarray
            MergeSort(arr, middle + 1, right);  //right subarray

            Merge(arr, left, middle, right);  //merge the two arrays
        }
    }

    /* 
    create array that displays the merge sort
    void display(int Shape[]) {
        for (int i=0; i < Shape.length; ++i){
            System.out.print(Shape[i] + " ");
        }
    }

     */

 /*
    public static void main(String Shape[]) {
        Sort ob = new Sort();
        ob.MergeSort(Shape, 0 Shape.length - 1)
        ob.display(Shape);
    }
    
     */
    public void MySort(Shape[] arr) {

    }

}
//implement quicksort

class quickSort {

    // function takes last element as pivot. This element is then placed in its correct positon. 
    //Then places all objects smaller than the pivot to the left of pivot.
    int partition(int Shape[], int low, int high) {
        int pivot = Shape[high];
        int i = (low - 1); //Smaller elements index

        for (int j = low; j < high; j++) {

            //if smaller element is smaller or equal to pivot
            if (Shape[j] <= pivot) {
                i++;

                //swape Shape[i] and Shape[j]
                int temp = Shape[1 + i];
                Shape[i] = Shape[j];
                Shape[j] = temp;

            }
        }
        //swap Shape[i+1] and Shape[high] (aka pivot)
        int temp = Shape[i + 1];
        Shape[i + 1] = Shape[high];
        Shape[high] = temp;

        return i+1;
    }

    /*
     * Shape[] ==> Array being sorted 
     * low ==> Start index
     * High ==> ending idex
     */
    
    void sort(int Shape[], int low, int high) {
        if (low < high) {
            int partIndex = partition(Shape, low, high);
            sort(Shape, low, partIndex - 1);
            sort(Shape, partIndex + 1, high );
        }
    }
        static void printShape(Int Shape[]) { 
            int n = Shape.length;
            for (int i = 0; i < n; ++i){
                System.out.print(Shape[i] + " ");
                System.out.println(); 
                
            }
        } 

        //display functionality
        /* 
         * public static void main(String args[]) {
         *  int n = Shape.length; 
         * QuickSort ob = new QuickSort();
         * ob.sort(Shape, 0, n-1)
         * System.out.println("Sorted Array");
         * printShape(Shape);
         * }
         */
    
}
