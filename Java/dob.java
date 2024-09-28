import java.util.Calendar;
import java.util.Scanner;
public class dob {
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        int day, month, year;
        System.out.println("Enter your date of birth in the format dd mm yyyy");
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();
        int currentYear = cal.get(Calendar.YEAR);
        int currentMonth = cal.get(Calendar.MONTH) + 1;
        int currentDay = cal.get(Calendar.DAY_OF_MONTH);
        int age = currentYear - year; 
        if(month > currentMonth){ 
            age--; // if the current month is less than the month of birth then decrement the age 
        }
        else if(month == currentMonth){
            if(day > currentDay){
                age--; // if the current date is less than the date of birth then decrement the age by 1
            }
        }
        sc.close();
    }
}
