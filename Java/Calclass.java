import java.util.Calendar;
public class Calclass {
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        cal.set(2020, 12, 25, 12, 30, 45);
        System.out.println(cal.getTime());

    }
}
