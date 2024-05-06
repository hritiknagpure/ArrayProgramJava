class Demo{
 public static void main(String args[]){
   String str="abcdefghij";
   int len=str.length();
   if(len%2==1){
     System.out.print("Middle element is"+str.charAt(len/2));
   }
   else{
     ind mid=(len/2);
     system.out.print("Middle element is :"+str.charAt(mid-1) +" "+str.charAt(mid));
   }
 } 
}
OUTPUT: Middle element is :e f
