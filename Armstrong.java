import java.util.*;
public class Armstrong {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int sum=0;
        int ov=n;
        while (n>0){
            int d=n%10;

            sum=sum + d*d*d;
            n=n/10;
            
        }
        if (sum == ov){
        System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong");
    }
    }
}
