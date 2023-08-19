import java.util.*;
public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int num=0;

        for(int i=1; i<=10; i++){
            num=n*i;

            System.out.println(num);
        }
    }
}
