import java.util.Scanner;

public class uni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mix[] = new int[5];
        
        // Input elements into the array
        for (int i = 0; i < mix.length; i++) {
            mix[i] = sc.nextInt();
        }
        
        // Check for unique elements
        for (int i = 0; i < mix.length; i++) {
            int count = 0;
            for (int j = 0; j < mix.length; j++) {
                if (i != j && mix[i] == mix[j]) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(mix[i]);
            }
        }
        
        sc.close();
    }
}
//display unique elements in an array using nested for loop and if else statement