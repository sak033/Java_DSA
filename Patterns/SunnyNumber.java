class SunnyNumber{
public static void main(String[] args){
  int num=9;
  boolean isSunny =false;
  for(int i=1; i<=num; i++){
    if(i * i == (num+1)){
    isSunny= true;
   }

}

if(isSunny){
   System.out.println("Sunny number");
}
else{
  System.out.println("Not sunny Number");
}


}


}