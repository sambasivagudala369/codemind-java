import java.util.*;
import java.util.Scanner;
public class area{
    public static void main(String args[]){
        float a,b,c,s;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        s=(a+b+c)/2;
        Double are=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",are);
    }
}