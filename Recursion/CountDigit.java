class CountDigit{
public static void main(String[] args){
  int result=Count(123456, 0);
  System.out.println(result);

}

static int Count(int num, int count){

   if(num==0){
    return count;
   }
  
  int last=num%10;
  count++;
  return Count(num/10, count);


}

}