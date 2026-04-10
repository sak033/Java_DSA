class AutomorphicNumber{
  public static void main(String[] args){
   int num=25;
   int sqr=num*num;
   boolean isAuto=false;
   while(num!=0){
  int last=num%10;
  int last2=sqr%10;
  if(last==last2){
    isAuto=true;
    }
num/=10;
sqr/=10;
}

if(isAuto){
  System.out.println("Automorphic");
}
else{

System.out.println("Not Automorphic");
}
}
}