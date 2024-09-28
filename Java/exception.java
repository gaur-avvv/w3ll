public class exception {
    public static void main(String[] args){
        tyrepressureException t = new tyrepressureException(30,51,50,50);
    }
}

class tyrepressureException{
    private static int frontpressure = 50;
    private static int backpressure = 50;

    public tyrepressureException(int tyre1, int tyre2, int tyre3, int tyre4){
        //for front tyres
        if(tyre1 < frontpressure || tyre2 < frontpressure){
            System.out.println("Warning: Front tyre pressure is low");
        }
        //for back tyres
        if(tyre3 < backpressure || tyre4 <backpressure){
            System.out.println("Warning: Back tyre pressure is low");
        }
    }
}
