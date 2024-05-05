package Practise;

public class OccurrenceCount {

    public static void main(String[] args) {
        int[] arr = {1, 2,1, 3, 4, 5, 1, 2, 3, 4}; // Example array of numbers
        int count=0;

        for(int i = 0; i < arr.length; i++) {
            count = 0;
            int num = arr[i];
            for(int j = 0; j < arr.length; j++) {
                int n = arr[j];
                if(i > j && num == n) {
                    break;
                }
                if(num == n) {
                    count++;
                }
            }
            if(count != 0) {
                System.out.println(num + "->" + count);
            }
        }
    }
}
OUTPUT___
1->3
2->2
3->2
4->2
5->1
