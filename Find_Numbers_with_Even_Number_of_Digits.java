import java.util.*;
public class find_numbers
{
    public static void main(String args[])
    {
        //int[] a = {123 , 34 , 3434 , 121 , 100};
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}

        System.out.println(findNumbers(a));
    }
    static int numberOfDigits(int n)
    {
        int cnt = 0;
        while(n > 0)
        {
            n /= 10;
            cnt++;
        }
        return cnt;
    }
    static int findNumbers(int[] a)
    {
        int result = 0;
        for(int i = 0 ; i < a.length ; i++)
            if(numberOfDigits(a[i]) % 2 == 0)
                result++;
        return result;
    }
}
