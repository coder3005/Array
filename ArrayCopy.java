/* Copy Array Elements */
// first a[]=10,20,30 ----> second b[]=10,20,30

import java.util.Scanner;
class A 
{
    public static void main(String[] args) {

        int a[]=new int[5];
        int b[]=new int[5];  // size of b can be greater than a but can't be less than a
        Scanner r=new Scanner(System.in);
        System.out.print("Enter value in first array ");
        for(int i=0;i<5;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print("First array Elements ");
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("\nSecond array Elements ");
        for(int i=0;i<5;i++)
        {
            b[i]=a[i];
            System.out.print(b[i]+" ");
        }
    }
}
