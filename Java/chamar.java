import java.util.Scanner;
public class chamar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int key = sc.nextInt(); //taking the key as input from the user
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i); //extracting the character at ith position and storing it in c then checking if it is a letter or not
            if(c>='a' && c<='z'){ //if it is a small letter then add the key to it and check if it is greater than z then subtract 26 from it
                c = (char)(c+key); //typecasting the integer to character as the ascii value of the character is an integer
                if(c>'z'){ //if the character is greater than z then subtract 26 from it to get the correct character
                    c = (char)(c-26); //typecasting the integer to character as the ascii value of the character is an integer 
                }
            }
        }
        System.out.println(str);
        sc.close();
    }
}