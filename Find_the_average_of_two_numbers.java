import java.util.Scanner;
public class avg{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n1,n2;
        n1=sc.nextDouble();
        n2=sc.nextDouble();
        double n3=(n1+n2)/2;
        System.out.printf("%.4f",n3);
    }
}