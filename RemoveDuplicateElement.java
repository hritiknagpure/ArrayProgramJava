package Practise.java;

public class NonRepeating {

	public static void main(String[] args) {
	  //without another array
		int arr[] = { 1,2,2,3,4,5 };
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
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
OUTPUT
  1
  3
  4
  5
