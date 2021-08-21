package Arrays;

import javax.security.auth.kerberos.KerberosCredMessage;

public class Sorting {

    public static int[] insertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int previous = i - 1;
            while (previous >= 0 && key < array[previous]) {
                array[previous + 1] = array[previous];
                previous--;
            }
            array[previous + 1] = key;
        }
        return array;
    }

    //worst sort
    //minimum index
    public static int[] selectionSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static int[] quickSort(int array[], int low, int high) {
        if (low < high) {
            int pi = getPI(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
        return array;
    }

    public static int getPI(int array[], int low, int high) {
        for (int i = low; i < high; i++) {
            if (array[i] < array[high]) {
                swap(array, low, i);
                low++;
            }
        }
        swap(array, low, high);
        return low;
    }

    public static void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
        return arr;
    }


    public static int[] mergerSort(int array[], int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergerSort(array, left, mid);
            mergerSort(array, mid + 1, right);

            sortedMerge(array, left, mid, right);
        }

        return array;
    }

    public static void sortedMerge(int array[], int left, int mid, int right) {
        int l1 = mid - left + 1;
        int l2 = right - mid;

        int[] leftTemp = new int[l1];
        int[] rightTemp = new int[l2];

        for (int i = 0; i < l1; ++i)
            leftTemp[i] = array[left + i];
        for (int j = 0; j < l2; ++j)
            rightTemp[j] = array[mid + 1 + j];
        int i = 0, j = 0;
        int k = left;

        while (i < l1 && j < l2) {
            if (leftTemp[i] <= rightTemp[j]) {
                array[k] = leftTemp[i];
                i++;
            } else {
                array[k] = rightTemp[j];
                j++;
            }
            k++;
        }
        while (i < l1) {
            array[k] = leftTemp[i];
            i++;
            k++;
        }

        while (j < l2) {
            array[k] = rightTemp[j];
            j++;
            k++;
        }


    }
}
