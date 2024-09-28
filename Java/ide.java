import java.util.Scanner;
public class ide {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of matrix");
        int n[][]= new int[2][2];
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n.length;j++){
                n[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n.length;j++){
                if(n[i][j]!=0 || i==j && n[i][j]!=1){
                    System.out.println("Matrix is not identity matrix");
                    break;
                }
                if(i==j && n[i][j]==1){
                    System.out.println("Matrix is identity matrix");
                    break;
                }
            }
        }
        sc.close();
    }
}
