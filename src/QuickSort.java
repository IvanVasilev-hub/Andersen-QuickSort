import java.util.Arrays;

public class QuickSort {
  public static void main(String[] args) {
    int[] array = {1, 2, 2, 4, 6, 0};
    quickSort(array, 0, 5);
    System.out.println(Arrays.toString(array));
  }

  private static int partition(int[] array, int left, int right) {
    int pivot = array[right];
    int partitionIndex = left;

    for (int i = left; i < right; i++) {
      if (array[i] < pivot) {
        swap(array, i, partitionIndex);
        partitionIndex++;
      }
    }

    swap(array, partitionIndex, right);

    return partitionIndex;
  }

  private static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public static void quickSort(int[] array, int left, int right) {
    if (left < right) {
      int pivot = partition(array, left, right);
      quickSort(array, left, pivot - 1);
      quickSort(array, pivot + 1, right);
    }
  }
}
