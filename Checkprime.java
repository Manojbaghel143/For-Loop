import java.util.*;
public class Checkprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        boolean flag = true;
       
        for(int i=2; i<n; i++){
            if (n%i==0){
                flag=false;
            }
        }

            if(flag==true){
                System.out.println("This Is Prime Number");
            }else {
                System.out.println("This Is Not Prime Number");
            }
        }
    }
