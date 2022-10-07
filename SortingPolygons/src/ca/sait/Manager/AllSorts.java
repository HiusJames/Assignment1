package ca.sait.Manager;

import ca.sait.ProblemDomain.*;

public class AllSorts {
	public String type;
	private boolean swapped = false;
	BaseAreacomp base = new BaseAreacomp();
	Volumecomp vol = new Volumecomp();

	public AllSorts(String type) {
		this.type = type;
	}

    /**
	 * SelectionSort() - Selection Sort.
	 *
     * @param arr - Array that is being sorted.
	 */
	public void SelectionSort(Shape[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int maxElementIndex = i;
			for (int j = i + 1; j < arr.length - 1; j++) {
				switch (type) {
				case "h":
					if (arr[maxElementIndex].compareTo(arr[j]) < 0)
						maxElementIndex = j;
					break;
				case "a":

					if (base.compare(arr[maxElementIndex], arr[j]) < 0)
						maxElementIndex = j;
					break;
				case "v":
					if (vol.compare(arr[maxElementIndex], arr[j]) < 0)
						maxElementIndex = j;
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

    /**
	 * BubbleSort() - Bubble Sort.
	 *
     * @param arr - Array that is being sorted.
	 */
	public void BubbleSort(Shape[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < (arr.length - i - 1); j++) {
				switch (type) {
				case "h":
					if (arr[j].compareTo(arr[j - 1]) > 0) {
						Shape temp = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = temp;
					}
					break;
				case "a":

					if (base.compare(arr[j], arr[j - 1]) > 0) {
						Shape temp = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = temp;
					}
					break;
				case "v":
					if (vol.compare(arr[j], arr[j - 1]) > 0) {
						Shape temp = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = temp;

					}
					break;
				}

			}
		}
	}

    /**
	 * InsertionSort() - Insertion Sort.
	 *
     * @param arr - Array that is being sorted.
	 */
	public void InsertionSort(Shape[] arr) {

		for (int i = 1; i < arr.length - 1; i++) {
			Shape current = arr[i];
			int j = i - 1;
			switch (type) {
			case "h":
				while ((j >= 0) && (arr[j]).compareTo(current) < 0) {
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
			arr[j + 1] = current;
			if (swapped == false) {
				break;
			}
		}
	}
	
    /**
	 * Merge() - Merge for Merge Sort.
	 *
     * @param arr - Array that is being sorted.
	 */
	void Merge(Shape arr[], Shape[] left, Shape[] right, int leftlength, int rightlength) {
		int i = 0, j = 0, k = 0;
		while (i < leftlength && j < rightlength) {
			switch (type) {
			case "h":
				if (left[i].compareTo(right[j]) >= 0) {
					arr[k++] = left[i++];

				} else {
					arr[k++] = right[j++];

				}
				break;
			case "a":

				if (base.compare(left[i], right[j]) > 0) {
					arr[k++] = left[i++];

				} else {
					arr[k++] = right[j++];

				}
				break;
			case "v":
				if (vol.compare(left[i], right[j]) > 0) {
					arr[k++] = left[i++];

				} else {
					arr[k++] = right[j++];

				}
				break;
			}
		}
		while (i < leftlength) {
			arr[k++] = left[i++];
		}
		while (j < rightlength) {
			arr[k++] = right[j++];
		}

	}

    /**
	 * MergeSort() - Merge Sort.
	 *
     * @param arr - Array that is being sorted.
	 */
	public void MergeSort(Shape arr[], int n) { // helper function creates sorting sub cases
		if (n < 2) {
			return;
		}

		int middle = n / 2;
		Shape[] l = new Shape[middle];
		Shape[] r = new Shape[n - middle];
		for (int i = 0; i < middle; i++) {
			l[i] = arr[i];
		}
		for (int i = middle; i < n; i++) {
			r[i - middle] = arr[i];
		}
		System.out.println("here is run left " + l.length);
		System.out.println("here is run right  " + r.length);
		MergeSort(l, middle); // left subarray
		MergeSort(r, n - middle); // right subarray

		Merge(arr, l, r, middle, n - middle); // merge the two arrays
	}

    /**
	 * QuickSort() - Quick Sort.
	 *
     * @param arr - Array that is being sorted.
	 */
	public void QuickSort(Shape[] arr, int begin, int end) {
		if (begin < end) {
			int partIndex = Partition(arr, begin, end);

			QuickSort(arr, begin, partIndex - 1);
			QuickSort(arr, partIndex + 1, end);
		}

	}

    /**
	 * Partition() - Partition for Quick Sort.
	 *
     * @param arr - Array that is being sorted.
	 */
	private int Partition(Shape arr[], int begin, int end) {
		Shape piv = arr[end];
		int i = (begin - 1);

		switch (type) {
		case "h":
			for (int j = begin; j < end; j++) {
				if (arr[j].compareTo(piv) > 0) {
					i++;
					Shape temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

			break;
		case "a":
			for (int j = begin; j < end; j++) {
				if (base.compare(arr[j], (piv)) > 0) {
					i++;
					Shape temp = arr[j];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			break;
		case "v":
			for (int j = begin; j < end; j++) {
				if (vol.compare(arr[j], (piv)) > 0) {
					i++;
					Shape temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
			break;

		}
		Shape temp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = temp;
		return i + 1;
	}

    /**
	 * MySort() - Our Sort.
	 *
     * @param arr - Array that is being sorted.
	 */
	public void MySort(Shape[] arr) {
		int gap = arr.length;
		boolean swapped = true;

		while (gap != 1 || swapped == true) {
			gap = (gap * 10) / 13;
			if (gap <= 1) {
				gap = 1;
			}
			swapped = false;

			for (int i = 0; i <= arr.length - 2 - gap; i++) {
				switch (type) {
				case "h":
					if (arr[i].compareTo(arr[i + gap]) < 0) {
						Shape temp = arr[i];
						arr[i] = arr[i + gap];
						arr[i + gap] = temp;
					}
					break;
				case "a":

					if (base.compare(arr[i], arr[i + gap]) < 0) {
						Shape temp = arr[i];
						arr[i] = arr[i + gap];
						arr[i + gap] = temp;
					}
					break;
				case "v":
					if (vol.compare(arr[i], arr[i + gap]) < 0) {
						Shape temp = arr[i];
						arr[i] = arr[i + gap];
						arr[i + gap] = temp;
					}
					break;
				}
			}
		}
	}
}