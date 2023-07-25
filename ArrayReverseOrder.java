/* Print array elements in reverse Order */
// input a[5]= 10 20 30 40 50 ---> 50 40 30 20 10

import java.util.Scanner;
class A 
{
    public static void main(String[] args) {
        
        int a[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter elements in array ");
        for(int i=0;i<5;i++) // in place of 5 we can write a.length
        {
            a[i]=r.nextInt();
        }
        System.out.print("Array Elements ");
        for(int i=0;i<5;i++) // in place of 5 we can write a.length
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("\nArray Reverse Elements ");
        for(int i=5-1;i>=0;i--) // in place of 5 we can write a.length
        {
            System.out.print(a[i]+" ");
        }
    }
}
