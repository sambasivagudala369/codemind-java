import java.util.*;
public class con{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int x,a,b;
    x=sc.nextInt();
    a=sc.nextInt();
    b=sc.nextInt();
    int c=a+2*b;
    if(c>=x){
        System.out.print("Qualify");
    }
    else{
        System.out.print("Not Qualify");
    }
    
}
}