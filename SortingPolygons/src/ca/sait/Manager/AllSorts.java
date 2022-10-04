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

    public void MergeSort(Shape[] arr) {

    }

    public void QuickSort(Shape[] arr) {

    }

    public void MySort(Shape[] arr) {

    }
}
