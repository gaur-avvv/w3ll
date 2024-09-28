import java.util.Scanner;
public class cons{
    public static void main(String[] args){
      Course c = new Course();
        c.display_courseData();
    }
}

class Course {
    public int ID;
    public String name;
    public String slot;
    
    Course(){
    Scanner sc = new Scanner(System.in);
    this.ID = sc.nextInt();
    this.name = sc.nextLine();
    this.slot = sc.nextLine();
    sc.close();  
    }
    


    void display_courseData(){
        System.out.println(this.ID);
        System.out.println(this.name);
        System.out.println(this.slot);
    }
}