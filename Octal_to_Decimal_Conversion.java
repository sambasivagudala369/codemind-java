import java.util.Scanner;
public class Octa{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        int b=Integer.parseInt(a,8);
        System.out.println(b);
    }
}