package Arrays;

import java.util.Stack;

public class JavaBasics {

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    //brute force approach
    public static int gcd(int n, int m) {
        int gcd = 1;
        for (int i = 2; i <= n && i <= m; i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    //eculids
    public static int gcdEculids(int n, int m) {
        if (m == 0) {
            return n;
        }
        return gcdEculids(m, n % m);
    }

//    public static int count(String s, String target) {
//        3 int count = 0;
//        4 int n = target.length();
//        5 for (int i = 0; i <= s.length() n;
//        i++) {
//            6 String piece = s.substring(i, i + n);
//            7 if (piece.equals(target)) count++;
//            8 }
//        9 return count;
//        10 }

    //
//    public class ArrayFunctions {
//2 public static int linearSearch(int[] data, int target) {
//            3 for (int i = 0; i < data.length; i++) {
//                4 if (target == data[i]) return i;
//                5 }
//            6 return 1;
//            7 }

//    public static int binarySearch(int[] data, int target) {
//        3 int left = 0;
//        4 int right = data.length 1;
//        5 while (left <= right) {
//            6 int mid = (left + right) / 2;
//            7 if (target == data[mid]) {
//                8 return mid;
//                9 } else if (target < data[mid]) {
//                10 right = mid 1;
//                11 } else {
//                12 left = mid + 1;
//                13 }
//            14 }
//        15 return 1;
//        16 }
int binarySearch(int arr[], int l, int r, int x)
{
    if (r >= l) {
        int mid = l + (r - l) / 2;

        // If the element is present at the
        // middle itself
        if (arr[mid] == x)
            return mid;

        // If element is smaller than mid, then
        // it can only be present in left subarray
        if (arr[mid] > x)
            return binarySearch(arr, l, mid - 1, x);

        // Else the element can only be present
        // in right subarray
        return binarySearch(arr, mid + 1, r, x);
    }

    // We reach here when element is not present
    // in array
    return -1;
}


//    Sample
    int i = 0xa5;
    int bin = 00000001;
    long l = 12331L;
    //Integr has many methods - > read them


    public static void main(String[] args) {
//        System.out.println( Integer.reverse(1234)); //2s complement
        System.out.println(System.currentTimeMillis());
        StringBuilder str = new StringBuilder("agxshagun");
        //System.out.println(JavaBasics.gcdEculids(6, 15));

        String s = "dfdf";
        int[] array = {50,23,9,18,61,32};
//        System.out.println(JavaBasics.gcd(6, 15));
//        System.out.println("abc".compareTo("bcd"));
        System.out.println(s.hashCode());

        System.out.println(s.hashCode());
//        System.out.println(str.substring(str.length() - 3, str.length())); //please read
        for (int value :
                Sorting.bubbleSort(array,array.length)) {
            System.out.print(value + " ");
        }

    }


}

