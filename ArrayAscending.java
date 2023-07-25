/* Sort array Elements in ascending Order */
// lets a[5]= 14 10 20 30 40 ---> 10 14 20 30 40

import java.util.Scanner;
class A 
{
    public static void main(String[] args) {
         int a[]=new int[5]; int temp;
         Scanner r=new Scanner(System.in);
         System.out.print("Enter array elements ");
         for(int i=0;i<a.length;i++)
         {
            a[i]=r.nextInt();
         }
         for(int i=0;i<a.length;i++)
         {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }

         }
         for(int i=0;i<a.length;i++)
         {
            System.out.print(a[i]+" ");
         }
    }
}
