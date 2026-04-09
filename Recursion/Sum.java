class Sum{
public static void main(String[] args){
   int result=SumOfNum(5);
System.out.println(result);
}

static int SumOfNum(int num){
   if(num==1){
   return 1;
}

return SumOfNum(num-1)+num;



}
}