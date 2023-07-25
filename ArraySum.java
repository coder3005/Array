/* Find Sum of Array Elements */
import java.util.Scanner;
class A 
{
    public static void main(String[] args) {
        
        int a[]=new int[5]; int sum=0;
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
            sum=a[i]+sum;
        }
        System.out.print("\nAddition of Array Elements "+sum);
    }
}
