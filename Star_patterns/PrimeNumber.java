class PrimeNumber{
    public static void main(String[] args){
     int num=30;
     int count=0;
     for(int i=2; i<=num/2; i++){
        if(num%i==0){
          count++;
          break;
        }
        
     }
    if(count!=0){
        System.out.println("Not prime");
    }
    else{
        System.out.println("Prime number");
    }

    }
}