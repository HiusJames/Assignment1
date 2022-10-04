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

    public void Merge(int Shape[], int left, int middle, int right) {
        int low = middle - left + 1; //size of the left Subarray
        int high = right - middle;  //Size of the right Subarray

        int L[] = new int[low];    //create left and right subarray
        int R[] = new int[high];  

        int i = 0, j = 0;

        for (i = 0; i < low; i++) {  //gets elements into left subarray
            L[i] = Shape[left + 1];
        }
        for (j = 0; j < high; j++) { //gets elements into right subbarray
            R[j] = Shape[middle + 1 + j];
        }
        int k = left;  //strarting index for sort
        i = 0;  //reset loop variables before merge
        j = 0;

        while (i < low && j < high) {  //mergre left and right subarrays
            if (L[i] <= R[j]) {
                Shape[k] = L[i];
                i++;
            } else {
                Shape[k] = R[j];
                j++;
            }
            k++;
        }
        while ( i < low) { //merge remaining elements from left sub arr
            Shape[k] = R[j];
            j++;
            k++;
        }

    }
    void MergeSort(int Shape[], int left, int right) { //helper function creates sorting sub cases
        int middle;
        if (left < right) { //only sort if the left index is less than right
            middle = (left + right) / 2; 

            MergeSort(Shape, left, middle);  //left subarray
            MergeSort(Shape, middle + 1, right);  //right subarray

            Merge(Shape, left, middle, right);  //merge the two arrays
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

    public void QuickSort(Shape[] arr) {

    }

    public void MySort(Shape[] arr) {

    }

}
