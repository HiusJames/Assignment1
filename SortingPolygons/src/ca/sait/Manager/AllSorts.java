package ca.sait.Manager;

import ca.sait.ProblemDomain.*;

public class AllSorts {
<<<<<<< HEAD

    protected String type;

    public void AllSorts(String type) {
=======
    public String type;
    private boolean swapped;
    BaseAreacomp base = new BaseAreacomp();
    Volumecomp vol = new Volumecomp();
    public AllSorts(String type) {
>>>>>>> ceda3b6348e580876c95fc416cb89a341df0c805
        this.type = type;
    }

    public void SelectionSort(Shape[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxElementIndex = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                switch (type) {
                    case "h":
                        if (arr[maxElementIndex].compareTo(arr[j]) < 0) {
                            maxElementIndex = j;
                        }
                        break;
<<<<<<< HEAD
                    case "b":
                        BaseAreacomp base = new BaseAreacomp();
                        if (base.compare(arr[maxElementIndex], arr[j]) < 0) {
=======
                    case "a":
                
                        if (base.compare(arr[maxElementIndex], arr[j]) < 0)
>>>>>>> ceda3b6348e580876c95fc416cb89a341df0c805
                            maxElementIndex = j;
                        }
                        break;
                    case "v":
<<<<<<< HEAD
                        Volumecomp vol = new Volumecomp();
                        if (vol.compare(arr[maxElementIndex], arr[j]) < 0) {
=======
                        if (vol.compare(arr[maxElementIndex], arr[j]) < 0)
>>>>>>> ceda3b6348e580876c95fc416cb89a341df0c805
                            maxElementIndex = j;
                        }
                        break;
                }

            }

            if (maxElementIndex != i) {
                Shape temp = arr[i];
                arr[i] = arr[maxElementIndex];
                arr[maxElementIndex] = temp;
            }
        }

    }

    public void BubbleSort(Shape[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
            	swapped = false;
                switch (type) {
                    case "h":
                        if (arr[j].compareTo(arr[j + 1]) > 0) {
                            Shape temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                            swapped = true;
                        }
                        break;
                    case "a":
                
                        if (base.compare(arr[j], arr[j + 1]) > 0) {
                            Shape temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                            swapped = true;
                        }
                        break;
                    case "v":
                        if (vol.compare(arr[j], arr[j + 1]) > 0) {
                            Shape temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                            swapped = true;
                        }

                        break;
                }
                if (swapped != true) {
                	break;
                }

            }
        }
    }

    public void InsertionSort(Shape[] arr) {

        for (int i = 1; i < arr.length; i++) {
            Shape current = arr[i];
            int j = i - 1;
            switch (type) {
                case "h":
                    while ((j >= 0) && (arr[j]).compareTo(current) > 0) {
                        arr[j + 1] = arr[j];
                        j--;
                        swapped = true;
                    }
                    break;
                case "a":
            
                    while ((j >= 0) && (base.compare(arr[j], current) < 0)) {
                    	arr[j + 1] = arr[j];
                        j--;
                        swapped = true;
                    }

                    break;
                case "v":
                    while ((j >= 0) && (vol.compare(arr[j], current) < 0)) {
                    	arr[j + 1] = arr[j];
                        j--;
                        swapped = true;
                    }
                    break;
            }
            if (swapped == false) {
            	break;
            }
            arr[j - 1] = current;
        }
    }

    void Merge(Shape arr[], int left, int middle, int right) {
        int low = middle - left + 1; // size of the left Subarray
        int high = right - middle; // Size of the right Subarray

        Shape[] L = new Shape[low]; // create left and right subarray
        Shape[] R = new Shape[high];

        int i = 0, j = 0;

        for (i = 0; i < low; i++) { // gets elements into left subarray
            L[i] = arr[left + 1];
        }
        for (j = 0; j < high; j++) { // gets elements into right subbarray
            R[j] = arr[middle + 1 + j];
        }
        int k = left; // strarting index for sort
        i = 0; // reset loop variables before merge
        j = 0;

        while (i < low && j < high) { // mergre left and right subarrays
            switch (type) {
                case "h":
                    if (L[i].compareTo(R[j]) < 0) {
                        arr[k] = L[i];
                        i++;
                    } else {
                        arr[k] = R[j];
                        j++;
                    }
                    break;
                case "a":
            
                    if (base.compare(L[i], R[j]) < 0) {
                        arr[k] = L[i];
                        i++;
                    } else {
                        arr[k] = R[j];
                        j++;
                    }
                    break;
                case "v":
<<<<<<< HEAD
                    Volumecomp vol = new Volumecomp(); //same throughout, implement the if condition for quicksort
=======
>>>>>>> ceda3b6348e580876c95fc416cb89a341df0c805
                    if (vol.compare(L[i], R[j]) < 0) {
                        arr[k] = L[i];
                        i++;
                    } else {
                        arr[k] = R[j];
                        j++;
                    }

                    break;

            }

            k++;
        }
        while (i < low) { // merge remaining elements from left sub arr
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    public void MergeSort(Shape arr[], int left, int right) { // helper function creates sorting sub cases
        int middle;
        if (left < right) { // only sort if the left index is less than right
            middle = (left + right) / 2;

            MergeSort(arr, left, middle); // left subarray
            MergeSort(arr, middle + 1, right); // right subarray

            Merge(arr, left, middle, right); // merge the two arrays
        }
    }

    /*
     * create array that displays the merge sort
     * void display(int Shape[]) {
     * for (int i=0; i < Shape.length; ++i){
     * System.out.print(Shape[i] + " ");
     * }
     * }
     * 
     * public static void main(String Shape[]) {
     * Sort ob = new Sort();
     * ob.MergeSort(Shape, 0 Shape.length - 1)
     * ob.display(Shape);
     * }
     * 
     */

 /*  
    public void QuickSort(Shape arr[]) {
        int begin = 0;
        int end = 0;
        if (low < high) {

        }
    }
     */
    public void QuickSort(Shape arr[]) {
        int begin = 0;
        int end = 0;
        if (begin < end) {

            int partIndex = PartitionQui(arr, begin, end);

            quickSort(arr, begin, partIndex - 1);
            quickSort(arr, partIndex + 1, end);
        }

    }

    private int Partition(Shape arr[], begin, end) {
        int begin = 0;
        int end = 0;
        Shape piv = arr[end];
        int i = (begin - 1);

        switch (type) {
            case "h":
                for (int j = begin; j < end; j++) {
                    if (arr[j].compareTo(piv) < 0) {
                        i++;
                        Shape swapTemp = arr[i];
                        arr[j] = swapTemp;
                    }
                }

                break;
            case "b":
                for (int j = begin; j < end; j++) {
                    BaseAreacomp base = new BaseAreacomp();
                    if (base.compare(arr[j], (piv)) < 0) {
                        i++;
                        swapTemp = arr[j];
                        arr[j] = swapTemp;
                    }
                }
                break;
            case "v":
                for (int j = begin; j < end; j++) {
                    if (vol.compare(arr[j], (piv)) < 0) {
                        Volumecomp vol = new Volumecomp();
                        i++;
                        Shape swapTemp = arr[i];
                        arr[j] = swapTemp;

                    }
                }
                break;

        }
        Shape swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;
        return i + 1;
    }

    public void MySort(Shape[] arr) {
//        int gap = arr.length;
//        double shrink = 1.3;
//        boolean swapped = true;
//
//        while (gap != 1 || swapped == true) {
//            gap = floor(gap / 1.3);
//            if (gap <= 1) {
//                gap = 1;
//            }
//            swapped = false;
//
//            for (int i = 0; i <= arr.length + 1 - gap; i++) {
//                switch (type) {
//                    case "h":
//                    if (arr[i].compareTo(arr[i + gap])) {
//                        int temp = arr[i];
//                        arr[i] = arr[i + gap];
//                        arr[i + gap] = temp;
//                    }
//                        break;
//                    case "a":
//                
//                    if (base.compare(arr[maxElementIndex], arr[j]) < 0) {
//                        int temp = arr[i];
//                        arr[i] = arr[i + gap];
//                        arr[i + gap] = temp;
//                    }
//                        break;
//                    case "v":
//                    if (vol.compare(arr[maxElementIndex], arr[j]) < 0) {
//                        int temp = arr[i];
//                        arr[i] = arr[i + gap];
//                        arr[i + gap] = temp;
//                    }
//                        break;
//                }
//            }
//        }
    }
}
