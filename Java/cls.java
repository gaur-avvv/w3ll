import java.util.Scanner;

public class cls{
    public static void main(String[] args){
        Student s = new Student();
        Course c = new Course();
        Faculty f = new Faculty();
        s.set();
        s.display();
        c.set();
        c.display();
        f.set();
        f.display();
    }
}

class Student{
    public String name;
    public int regno;
    public String branch;
    public int age;
    public void set(){
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        this.regno = sc.nextInt();
        this.branch = sc.nextLine();
        this.age = sc.nextInt();
        sc.close();
    }
    public void display(){
        System.out.println(this.name + " " + this.regno + " " + this.branch + " " + this.age);
    }
}

class Course{
    public String name;
    public int code;
    public String branch;
    public int credit;
    public void set(){
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        this.code = sc.nextInt();
        this.branch = sc.nextLine();
        this.credit = sc.nextInt();
        sc.close();
    }
    public void display(){
        System.out.println(this.name + " " + this.code + " " + this.branch + " " + this.credit);
    }
}

class Faculty{
    public String name;
    public int ID;
    public String branch;
    public int roomno;
    public void set(){
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        this.ID = sc.nextInt();
        this.branch = sc.nextLine();
        this.roomno = sc.nextInt();
        sc.close();
    }
    public void display(){
        System.out.println(this.name + " " + this.ID + " " + this.branch + " " + this.roomno);
    }
}