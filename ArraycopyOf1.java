/* Sort() Equals() copyOf() */

// copyOf()

import java.util.Arrays;
import java.util.Scanner;
class A 
{
    public static void main(String[] args) {
         
        int a[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Data in Array ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        int a2[]=Arrays.copyOf(a,6);
        a2[5]=100
        System.out.print("Data in Array2 ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a2[i]+" ");
        }
        
    }
}
