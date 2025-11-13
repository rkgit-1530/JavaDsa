public class BinarySearchIterative {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;  // middle index

            if (arr[mid] == target) {
                return mid;                // element found
            }

            if (arr[mid] < target) {
                left = mid + 1;            // search right half
            } else {
                right = mid - 1;           // search left half
            }
        }

        return -1;  // not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};

        int target = 22;
        int result = binarySearch(arr, target);

        if (result != -1)
            System.out.println("Found at index: " + result);
        else
            System.out.println("Not Found");
    }
}
