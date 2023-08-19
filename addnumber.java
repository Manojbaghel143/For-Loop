import java.util.Scanner;

public class addnumber {
    public static void main(String[] args) {
         int a=4567;
        int og;
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        og=n;


        for( ;n!=0;n/=10){

           int digit=n%10;
            a=a+digit;




        }
        if(a==og){
            
        
        }
        
        System.out.println(a);
    }
}
