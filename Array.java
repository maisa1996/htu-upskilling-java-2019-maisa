public class Array{


public static void main(String args[]){
 
int n=Integer.parseInt(args[0]);
Instant s = new Instant.now():
int array1[][] = new int[n][n];
int array2[][] = new int[n][n];
int array3[][] = new int[n][n];
int avg=0;
 int sum=0;
for(int i=0;i<n ;i++){
	for(int s=0;i<n;s++){
		int random=(int) (Math.random()*1000);
		array1[i][s]=random;
		int random2=(int) (Math.random()*1000);
		array2[i][s]=random2;
		int random3=(int) (Math.random()*1000);
		array3[i][s]=random3;
		sum=sum+array1[i][s]+array2[i][s]+array3[i][s];
		avg=sum/n;
		
		
	}
	
	
}
Instant e = new Instant.now():
System.out.printLn(Daration.between(s,e));

}

}