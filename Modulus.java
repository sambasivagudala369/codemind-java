import java.util.Scanner;
public class modls{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.print(+(n1%n2));
    }
}