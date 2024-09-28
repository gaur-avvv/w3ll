public class testProject {
  
    public enum classx {ABC, DEF, GHI, JKL, MNO, PQR, STU, VWX, YZ};
    public static void main(String[] args) {		
       for(classx s: classx.values()){
          System.out.println(s);
       }
    
    }
  } 