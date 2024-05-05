package Practise.java;

public class NonRepeating {

	public static void main(String[] args) {
		int arr[]= {1,3,1,1,4,6,4,1,9,5,6,5,7,8,8};
		for(int i=0;i<arr.length;i++) {
			int x=arr[i];
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==x) {
					count++;
				}
				if(i>j&&arr[i]==arr[j]) {
					break;
				}
			}
			if(count>=2) {
				System.out.println(arr[i]);
			}
		}

	}

}
OUTPUT____
  1
  4
  6
  5
  8
