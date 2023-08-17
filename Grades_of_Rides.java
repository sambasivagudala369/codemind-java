import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int p=sc.nextInt();
        int s=sc.nextInt();
        if(h>50&&p>60&&s>100){
            System.out.print(10);
        }
        else if(h>50&&p>60){
            System.out.print(9);
        }
        else if(p>60&&s>100){
            System.out.print(8);
        }
        else if(h>50&&s>100){
            System.out.print(7);
        }
        else if(h>50||p>60||s>100){
            System.out.print(6);
        }
        else{
            System.out.print(5);
        }
    }
}