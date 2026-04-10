class CheckPalindrome{
public static void main(String[] arg){
   int n=121;
   int org=n;
   int result=Reverse(n, 0);
   if(org==result){
      System.out.println("Palindrome");

}
}

static int Reverse(int num, int rev){
  
if(num==0){
  return rev;
}

int last=num%10;
rev=rev*10+last;
return Reverse(num/10, rev);


}
}