public class DescendingInsertionSort {

    public static void descendingInsertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are *smaller* than key,
            // to one position ahead of their current position.
            // The original condition for ascending sort was (arr[j] > key).
            // For descending sort, we use the condition (arr[j] < key).
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Example usage:
    public static void main(String[] args) {
        int[] data = {9, 5, 1, 4, 3};
        System.out.println("Original Array:");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();

        descendingInsertionSort(data);

        System.out.println("Sorted Array in Descending Order:");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Expected output: 9 5 4 3 1
    }
}
