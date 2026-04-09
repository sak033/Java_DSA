class FabonacciSeriesLoop{
public static void main(String[] args){
 
int n=7;
int pre1=0;
int pre2=1;

while(n!=0){
System.out.print(pre1+ " ");
int sum=pre1+pre2;
pre1=pre2;
pre2=sum;
n--;
}

}


} 