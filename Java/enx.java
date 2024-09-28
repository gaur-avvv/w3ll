//sort the elements of a 2D array in decending order using enhanced for loop also explain withn commnets
import java.util.Arrays;
import java.util.Scanner;
public class enx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the elements of the 2D array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int[] row : arr) {
            Arrays.sort(row); //sorting the elements of the 2D array in ascending order
            for (int i = row.length - 1; i >= 0; i--) { //sorting the elements of the 2D array in descending order
                System.out.print(row[i] + " "); 
            }
            System.out.println();
        }
        sc.close();
    }
}