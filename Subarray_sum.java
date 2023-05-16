import java.util.*;
import java.util.Scanner;
public class Subarray_sum 
{
    public static void main(String[] args)
    {
        int a[] = new int[100];
        int i,target_sum,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Target_sum:");
        target_sum=sc.nextInt();
        System.out.println("enter the value of n:");
        n=sc.nextInt();
        System.out.println("enter the array elements:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]+a[j]==target_sum)
                {
                    System.out.println("the elements are"+a[i]+","+a[j]);
                    System.out.println("the index is"+i+","+j);
                }
            }
        }
    }
}

