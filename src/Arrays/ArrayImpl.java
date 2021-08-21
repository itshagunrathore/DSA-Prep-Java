package Arrays;

import java.util.Arrays;

public class ArrayImpl {
    public static void main(String[] args) {
        int nums[] = {4, 5, 32, 1, 1, 2, 4, 3, 4, 2, 3};
        int nums2[] = {1, 2, 3, 4};
        int array[] = {5, 3, 1, 9};
        int arr[] = {2, 3, 1, 1, 2, 4, 2, 0, 1, 1};
        int[][] intervals ={{2,3},{4,5},{6,7},{8,9},{1,10}};
//,{4,10},{15,18}};
//        System.out.println(Arrays.toString(Problems.reverse(array)));
//        Problems.rotateByOne(nums2);
        System.out.println(Problems.merge2arr(intervals));
//        merge(nums, 3, nums2, 3);
    }

    public static void merge(int[] A, int m, int[] B, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            A[k--] = A[i] > B[j] ? A[i--] : B[j--];
        }
        while (j >= 0) {
            A[k--] = B[j--];
        }

    }
}

