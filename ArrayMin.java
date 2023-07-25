/* Find Smallest Element in Array */
import java.util.Scanner;
class A 
{
    public static void main(String[] args) {
        
        int a[]=new int [5]; int min;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Array Elements ");
        for(int i=0;i<5;i++)
        {
            a[i]=r.nextInt();
        }
        min=a[0];
        for(int i=1;i<5;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.print("Minimum Element "+min);
    }
}
