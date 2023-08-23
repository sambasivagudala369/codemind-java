import java.util.*;
public class exp{
    public static void main(String[] args ){
        Scanner sc= new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        int to=y*30;
        if(x>=to){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}