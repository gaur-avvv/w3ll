import java.util.Scanner;
public class enc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be encrypted");
        String str = sc.nextLine();
        System.out.println("Enter the key");
        int key = sc.nextInt();
        if(key>27){
            System.out.println("Key should be less than 27");
            //enter new value
            key = sc.nextInt();
        } //taking the key as input from the user
        String store = ""; //empty string to store the encrypted string and later print it
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i); 
            if(c>='a' && c<='z'){
                c = (char) (c+key);
                if(c>'z'){
                    c = (char)(c-26);
                } //extracting the character at ith position and storing it in c then checking if it is a letter or not)
        }
        store = store + c;
        }
        System.out.println(store);
        sc.close();
    }
}