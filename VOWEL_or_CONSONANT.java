import java.util.*;
public class vc{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    char ch;
    ch=sc.next().charAt(0);
    ch = Character.toLowerCase(ch);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        System.out.print("VOWEL");
    }
    else{
        System.out.print("CONSONANT");
    }
}
    
}