//encryption and deencryption explain everyline working with comments
import java.util.Scanner;
public class den{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be encrypted");
        String str = sc.nextLine();
        System.out.println("Enter the key");
        int key = sc.nextInt();
        if(key>27){
            System.out.println("Key should be less than 27");
        } //taking the key as input from the user
        String enc = ""; //empty string to store the encrypted string and later print it
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i); //extracting the character at ith position and storing it in c then checking if it is a letter or not
            if(c>='a' && c<='z'){ //if it is a small letter then add the key to it and check if it is greater than z then subtract 26 from it
                c = (char)(c+key); //typecasting the integer to character as the ascii value of the character is an integer
                if(c>'z'){ //if the character is greater than z then subtract 26 from it to get the correct character
                    c = (char)(c-26); //typecasting the integer to character as the ascii value of the character is an integer 
                }
                System.out.println(c);
            }
            else if(c>='A' && c<='Z'){ //if it is a capital letter then add the key to it and check if it is greater than Z then subtract 26 from it
                c = (char)(c+key); //typecasting the integer to character as the ascii value of the character is an integer
                if(c>'Z'){ //if the character is greater than Z then subtract 26 from it to get the correct character
                    c = (char)(c-26); //typecasting the integer to character as the ascii value of the character is an integer
                }
            }
            enc = enc + c;
            System.out.println(enc);
        }
        sc.close();
    }
}