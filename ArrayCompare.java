/* Compare Arrays */
// 1. ==
// 2. equals()

import java.util.Arrays;
class A 
{
    public static void main(String[] args) {
        
        int a[]={10,20,30,40,50};
        int b[]={10,20,30,40,50};

        if(Arrays.equals(a,b))  // in bracket if we write a==b then other result will print
        {
            System.out.print("Both are Equals ");
        }
        else 
        {
            System.out.print("Both are not Equals ");
        }
    }
}
