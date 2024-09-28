import java.util.Scanner;
import java.util.Calendar;
public class cal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calendar c = Calendar.getInstance();
        System.out.println("Current date and time: " + c.getTime());
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        c.set(year, month, day);
        Calendar c2 = Calendar.getInstance();
        System.out.println(c2.getTime());
    }
}