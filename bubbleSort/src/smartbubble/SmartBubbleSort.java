package smartbubble;

public class SmartBubbleSort {
    /*
     *This method will sort the array according to bubble sort algorithm.
     * @param array to be sorted
     */
    public void smartBubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /*
     * This method will print the array
     * @param array is the array to be printed
     */
    public void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
}
