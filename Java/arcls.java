import java.util.Scanner;
public class arcls{
    public static void main(String[] args){
        New n[] = new New[5];
        for(int i=0;i<n.length;i++){
            n[i].set();
            n[i].display();
        }
    }
}
class New{
    public String projectname;
    public String projectid;
    public int teamsize;
    public void set(){
        Scanner sc = new Scanner(System.in);
        this.projectname = sc.nextLine();
        this.projectid = sc.nextLine();
        this.teamsize = sc.nextInt();
        sc.close();
    }
    public void display(){
        System.out.println(this.projectname +" "+this.projectid+" "+this.teamsize);
    }    
}
/*
  Create an Array of Objects and invoke the set and view methods for all the objects.

The class should be Jcomponent class.

The fields are

projectname
projectid
teamsize
Set and display the values for atleast 5 objects

 */
