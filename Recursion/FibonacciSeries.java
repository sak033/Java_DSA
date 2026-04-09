class FibonacciSeries{
public static void main(String[] args){
 int op=Series(0 , 1, 7);
 System.out.println(op);
}

static int Series(int pre1, int pre2, int n){
if(n==0){
return pre1;
}


int sum=pre1+pre2;

System.out.print(pre1+" ");
return Series(pre2, sum, n-1);

}

}