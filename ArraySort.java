/* Sort() Equals() copyOf() */

// Sort() ---> ascending order

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
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
