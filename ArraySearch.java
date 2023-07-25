/* Search Array Elements */
// a[5]= 10 20 30 40 50
// search item 30 ----> item found
// search item 70 ----> item not found

import java.util.Scanner;
class A 
{
    public static void main(String[] args) {
        
        int a[]=new int[5]; int n,count=0;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Elements in Array ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print("Array Elements ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("\nEnter search Elements ");
        n=r.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n)
            {
                count++;
            }
        }
        if(count>0)
        System.out.print("Item Found "+count+" times");
        else 
        System.out.print("Item not Found");
    }
}
