/* Matrix Program Using 2D Array */
import java.util.Scanner;
class A 
{
    public static void main(String[] args) {
        
        int a[][]=new int[2][2];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Array Elements : ");
        for(int i=0;i<2;i++)  // rows
        {
            for(int j=0;j<2;j++)  //columns
        {
            a[i][j]=r.nextInt();
        }
    }
    System.out.print("Matrix: \n");
    for(int i=0;i<2;i++)  // rows
        {
            for(int j=0;j<2;j++)  //columns
        {
            System.out.print(a[i][j]+" ");
        }
        System.out.print("\n");
    }
    

    }
}
