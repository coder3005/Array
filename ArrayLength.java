/* Find Length of Arrays */
import java.util.Scanner;
class A 
{
    public static void main(String[] args) {

        int a[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter elements in array ");
        for(int i=0;i<5;i++) // in place of 5 we can also write a.length
        {
            a[i]=r.nextInt();
        }
        System.out.print("Array elements ");
        for(int i=0;i<5;i++) // in place of 5 we can also write a.length
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("\nArray Length "+a.length);
    }
}
