public class SecondLargetNumber {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int arr[]= {5,3,2,1,6,8,9,0};
    int temp;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] < arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    System.out.println("the second largest number is: " + arr[1]);

    //print output
    for (int element: arr) {
      System.out.println(element);
    }

  }

}
