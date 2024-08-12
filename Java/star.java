import java.util.Scanner;
public class star{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=5;i>=n;i--){
            for(int j =4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
