import java.util.Scanner;
public class big{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a,b;
    a=sc.nextInt();
    b=sc.nextInt();
    if(a<b){
        System.out.println("Profit");
    }
    else if(a==b){
        System.out.println("No profit and No loss");
    }
    else{
        System.out.println("Loss");
    }
}
}