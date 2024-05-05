//Reverse a number
public class Main
{
	public static void main(String[] args) {
	 int num=4321;  //1234
	 int rev=0,rem;
	 while(num>0){
	     rem=num%10;
	     rev=rev*10+rem;
	     num=num/10;
	 }
	 System.out.print(rev);
}
}
