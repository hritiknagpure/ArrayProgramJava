public class NonRepeatingElement {

		    public static void main(String[] args) {
		        int arr[] = {1, 2, 3,6,7, 2, 1, 3, 6};
		        for (int i = 0; i < arr.length; i++) {
		            int count = 0;
		            for (int j = 0; j < arr.length; j++) {
		                if (arr[j] == x) {
		                    count++;
		                }
		            }
		            if (count == 1) {
		                System.out.println(arr[i]);
		            }
		        }
		    }

		}
		OUTPUT_____-> 7
