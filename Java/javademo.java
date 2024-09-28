import java.util.Scanner;
public class javademo {

  public static void main(String[] args) {
    
    students k[] = new students[2];
    Scanner input = new Scanner(System.in);
    // Your code here
    
    
    String regno;
    String name;
    for(int i=0;i<k.length;i++)
    {
      System.out.println("Enter the student REgno");
      regno=input.next();
      System.out.println("Enter your name");
      name=input.next();
      k[i]=new students(regno,name);
    }
    for(int i=0;i<k.length;i++)
    {
      k[i].display_arrayofobjects();
    }
    input.close();
  }


}

class students
{
  public String regNo;
  public String name;
  
  public students(String regNo, String name) {
    this.regNo = regNo;
    this.name = name;
  }
  
  public void display_arrayofobjects() {
    System.out.println(this.regNo+this.name);
  }
}
