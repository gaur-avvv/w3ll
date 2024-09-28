public class An {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.sleep();
    }
}
 abstract class Animal{
    public abstract void sound();
    public abstract void sleep();
    public abstract void eat();
 }
 class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Bark");
    }
    @Override
    public void sleep(){
        System.out.println("Sleep at night");
    }
    @Override
    public void eat(){
        System.out.println("Meat");
    }
 }