import java.util.*;
public class nolab {
    public static void main(String[] args) {
    Cat c = new Cat();
    c.makeSound();
    }
}
/*Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark. */
class Animal{
    public void makeSound(){
        System.out.println("Animal Sound");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Cat Sound");
    }
}