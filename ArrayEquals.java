/* Sort() Equals() copyOf() */

// Equals()

import java.util.Arrays;
import java.util.Scanner;
class A 
{
    public static void main(String[] args) {
         
        int a[]=new int[5];
        int a2[]=new int[5]; // we also can't change the size

        Scanner r=new Scanner(System.in);
        System.out.print("Enter Data in Array ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print("Enter Data in Array2 ");
        for(int i=0;i<a2.length;i++)
        {
            a2[i]=r.nextInt();
        }

        boolean b=Arrays.equals(a,a2);
        System.out.print("Kya Dono Array Equal Hai: "+b);
    }
}
