class ReverseNumber{
public static void main(String[] args){
   int reverseNum=Reverse(12345, 0);
   System.out.println(reverseNum);


}


static int  Reverse(int num, int rev){
  if(num==0){
   return rev;
   }
 int digit=num%10;
 rev=rev*10 + digit;
return Reverse(num/10, rev);



}
}