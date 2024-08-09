/*
Reverse the contents of the array  
Display Unique elements in an Array  
Sort an array (bubble sort) - dont use inbuilt methods  
Identity matrix  
Transpose of a matrix 
Sum of rows and columns of a matrix  
Addition of two matrices  
Minimum and Maximum Number  
encryption and decryption  
Sort Every Row of a 2D Array
Rotate the Matrix by 90 degrees
Spiral Matrix
Replace occurrences 
*/
import java.util.Scanner;
public class MyClass {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        for(int i=0;i<n;i++){
            num[i]= sc.nextInt();
        }
        int j = 0;
        for(int i=0;i<n-1;i++){
          if(num[i]!=num[i+1])
          {
            j++;
            num[j]=num[i+1];
          }
        }
        for(int i=0;i<=j;i++)
        {
          System.out.println(num[i]);
        }
        sc.close();
    }

}