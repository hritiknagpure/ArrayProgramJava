public class BinarySearch {
  public static int binarySearch(int arr[], int key) {
     int low = 0;
     int high = arr.length - 1;
      while (low <= high) {
       int mid = (low + high) / 2;
      if (arr[mid] > key) {
        high = mid - 1;
      } else if (arr[mid] < key) {
        low = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
   	int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
    int key = 2;
    System.out.println(binarySearch(arr, key));

  }

}
