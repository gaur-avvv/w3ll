import java.util.*;
  public class first
  {
  public static void main(String[] args) 
  {
    System.out.println("Enter numbers");
    Scanner input = new Scanner(System.in);
    int a[][] = new int[2][2];
    int b[][] = new int[2][2];
    int result[][] = new int[2][2];
    int i=0,j=0;
    System.out.println("Matrix 1 input");
    for(i=0;i<a.length;i++)
    {
      for(j=0;j<a[i].length;j++)
      {
        a[i][j]=input.nextInt();
      }
    }
    System.out.println("Matrix 2 input");
    for(i=0;i<a.length;i++)
    {
      for(j=0;j<a[i].length;j++)
      {
        b[i][j]=input.nextInt();
      }
    }
    //sum of two matrices
    for(i=0;i<a.length;i++)
    {
      for(j=0;j<a[i].length;j++)
      {
        result[i][j]=a[i][j]+b[i][j];
      }
    }
    
    for(int k[]:result) //explain this line of code 
    //for each loop is used to iterate through the array of arrays 
    {
      for(int m:k)
      {
        System.out.print(m);
      }
      System.out.println();
    }
  }	
  } 