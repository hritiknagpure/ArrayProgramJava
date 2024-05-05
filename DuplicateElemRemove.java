public class RemoveDuplicateElement {

    public static void main(String[] args) {
        int arr[]= {1,2,2,3,4,5,6,6,7,7,8};
        int arrlen = arr.length;
        //create temp arr for storing not duplicate element
        //int temp[]=new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
            }

        }
        arr[j] = arr[arr.length - 1];
        for (int k = 0; k <= j; k++) {
            System.out.println(arr[k]);
        }

    }

}
