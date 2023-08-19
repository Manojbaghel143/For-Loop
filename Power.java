import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum=1;
		
		for (int i=1; i<=m; i++){
		    sum = sum*n;
		}
		
		System.out.println(sum);
    }
}
