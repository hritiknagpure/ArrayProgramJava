public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int targetSum = 5;
        int targetSum2=3;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    int res=arr[i]+arr[j];
                    System.out.print( res+",");
                }
                    else if(arr[i]+arr[j]==targetSum2){
                        int res=arr[i]+arr[j];
                        System.out.println(arr[i]+","+arr[j]+": "+res);
                    }
                }
            }
        }
    
}
