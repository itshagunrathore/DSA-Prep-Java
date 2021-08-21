package Arrays;

import java.util.*;

public class Problems {
    public static int[] reverse(int array[]) {
        if (array.length <= 1) return array;

        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start++] = array[end];
            array[end--] = temp;
        }
        return array;

        //recurssion
        /*
        if(){
        reverse(array,start++,end--);
        }
         */
    }

    public static void unionAndIntersection(int a[], int b[]) {
        int lengthOfa = a.length;
        int lengthOfb = b.length;
        Set set = new HashSet();
        Set set1 = new HashSet();
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i <= (lengthOfa >= lengthOfb ? lengthOfa : lengthOfb) - 1; i++) {
            if (i < a.length) {
                set.add(a[i]);
                if (map.containsKey(a[i])) {
                    if (map.get(a[i]) == "b") {
                        set1.add(a[i]);
                    }
                } else {
                    map.put(a[i], "a");
                }
            }
            if (i < b.length) {
                set.add(b[i]);
                if (map.containsKey(b[i])) {
                    if (map.get(b[i]) == "a") {
                        set1.add(b[i]);
                    }
                } else {
                    map.put(b[i], "b");
                }
            }
        }
        System.out.println(set.toString());
        System.out.println(set1.toString());
    }

    public static void rotateByOne(int arr[]) {
        int pre = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                arr[i] = pre;
                break;
            }
            arr[i] = arr[i - 1];
        }
        Arrays.stream(arr).forEach(x -> System.out.println(x));
    }

    public static int maxSumContigiousSubarray(int[] arr) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (max < sum) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    static int maxSubArraySum(int a[], int size) {
        int max_so_far = a[0];
        int curr_max = a[0];

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a[i], curr_max + a[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    public static int minimizeHight(int arr[], int k) {
        int l = arr.length;
//        Arrays.sort(arr);
        int max = 0;
        int min = 0;
        int mindiff = 0;
        for (int i = 0; i < l; i++) {
            if (arr[i] - k > 0) {
                int temp = arr[i] - k;
                if (temp > max || max == 0) {
                    max = temp;
                }
                if (temp < min || min == 0) {
                    min = temp;
                }
            } else {
                int temp = arr[i] + k;
                if (temp > max || max == 0) {
                    max = temp;
                }
                if (temp < min || min == 0) {
                    min = temp;
                }
            }
//            if (max - min < mindiff || mindiff == 0) {
            mindiff = max - min;
//            }
        }
        return mindiff;
    }

    public static int minNumberOfJumps(int[] array) {
        int jumpCount = 0;
        int currValue = array[0];
        int currentIndex = 0;

        while (currentIndex <= array.length - 1) {
            if (currentIndex == array.length - 1) {
                break;
            }
            if (currValue + currentIndex > array.length - 1) {
                jumpCount++;
                break;
            }
            if (array[currentIndex + currValue] == 0) {
                return -1;
            }
            int temp = array[currValue + currentIndex];
            currentIndex = currValue + currentIndex;
            currValue = temp;
            jumpCount++;

        }
        if (jumpCount == 0) {
            return -1;
        }
        return jumpCount;
    }

    public static int[][] merge2arr(int[][] intervals) {
        int left = 0;
        int right = 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<String> list = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            if (i != 0) {
                if (right >= intervals[i][0] && (left < intervals[i][1])) {
                    if (right <= intervals[i][1]) {
                        right = intervals[i][1];
                    }
                    if(left > intervals[i][0]){
                        left = intervals[i][0];
                    }
                } else {
                    list.add(left+"-"+right);
                    left = intervals[i][0];
                    right = intervals[i][1];
                }

            } else {
                left = intervals[i][0];
                right = intervals[i][1];
            }

        }
        list.add(left+"-"+right);

        int arr[][] = new int[list.size()][2];
        int i =0 ;
        for (String s:
             list) {
            arr[i][0] = Integer.parseInt(s.substring(0,s.indexOf("-")));
            arr[i][1] = Integer.parseInt(s.substring(s.indexOf("-") + 1,s.length()));
        i++;}
        return arr;
    }
        public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
            LinkedList<int[]> merged = new LinkedList<>();
            for (int[] interval : intervals) {
                // if the list of merged intervals is empty or if the current
                // interval does not overlap with the previous, simply append it.
                if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                    merged.add(interval);
                }
                // otherwise, there is overlap, so we merge the current and previous
                // intervals.
                else {
                    merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
                }
            }
            return merged.toArray(new int[merged.size()][]);
        }
        public void nextPermutationLexo(int[] nums) {
            int i = nums.length -2;
            while(i >= 0 && nums[i+1] <= nums[i]){
                i--;
            }
            if(i >= 0){
                int j = nums.length -1;
                while(nums[j] <= nums[i]){
                    j--;
                }
                swap(nums, i ,j);
            }
            reverse(nums,i+1,nums.length-1);

        }

        public void swap(int nums[],int i , int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        public void reverse(int[] nums , int start, int end){
            while(start<end){
                swap(nums,start, end);
                start++;
                end--;
            }
        }

}
