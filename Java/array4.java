import java.util.Scanner;
public class array4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name[][] = new String[2][2];
        for(int i=0;i<name.length;i++){
            for(int j=0;j<name[i].length;j++){
                name[i][j]=sc.nextLine();
            }
        }
        for(String x[]:name){
            for(String y:x){
                System.out.println(y);
            }
        }
        sc.close();
    }
}
/*Read input for a multidimensional array from the user. The array should store two rows and two columns of data(strings). Display the output to the user using an enhanced for loop */