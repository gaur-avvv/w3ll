import java.util.Scanner;
public class uniq{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mix[] = new int[5];
        for(int i=0;i<mix.length;i++){
            mix[i]=sc.nextInt();
        }
        for(int i=0;i<mix.length;i++){
            if(mix[i]!=mix[i+1]){
                System.out.println(mix[i]);
            }
        }
        sc.close();
    }
}
