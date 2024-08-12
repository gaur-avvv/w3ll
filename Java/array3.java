public class array3 {
    public static void main(String[] args){
        String[][] address = {{"vellore","632006"},{"chennai","600025"}}; //multidimensional array of strings
        for(String[] x:address){ //for each loop is used to iterate through the array of arrays why use String[] x?: x is a string array that will store the contents of the array address
            for(String y:x){ //for each loop is used to iterate through the array of strings why use String y?: y is a string that will store the contents of the array x
                System.out.print(y+" "); //displaying the contents of the array using an enhanced for loop 
            }
            System.out.println();
        }
    }
}
/*Create a multidimensional array of strings and initialize it with the following values
vellore 632006
chennai 60025
Display the contents of the array using an enhanced for loop also explain with comments*/