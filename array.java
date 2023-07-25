/* Array in Java */
import java.util.Scanner;
class Demo
{
    public static void main(String[] args) {

        int size,i;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter size of Array ");
        size=r.nextInt();
        int a[]=new int [size];

        for(i=0;i<size;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print("Printed Array Elements ");
        for(i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
