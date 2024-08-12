import java.util.Scanner;
public class newarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name[]= new String[5];
        for(int i=0;i<name.length;i++){
            name[i]=sc.nextLine();
        }
        for(String i:name){
            System.out.println(i);
        }
        sc.close();
    }
}
/*Create an array name[] .Store three names in the array by getting the user input. Display the array contents using an enhanced for loop */