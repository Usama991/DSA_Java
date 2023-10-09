public class Agnostic {
    public static void main(String[] args) {
        int[] arr = {-19, -11, 0, 2, 4, 5, 7, 11, 15, 17, 22, 26};
        int target = 7;

        int ans = agnosticSearch(arr, target);
        if (ans != -1) {
            System.out.println("Element found at index: " + ans);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    static int agnosticSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending;

        if (arr[start] <= arr[end]) {
            isAscending = true;
        } else {
            isAscending = false;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1; // Target element not found in the array
    }
}