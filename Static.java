class test{
     int a = 10, b =11;
     static int c = 12;
     void setValue(int x, int y){
          a = x;
          b = y;
     }
     static void setC(int z){ // static method 
          c = z;
     }
}
public class Static {
     private int x1;
     private static int x2;

     public static void main(String[] args) {
          test t1 = new test();
          t1.setValue(100, 200);
          t1.setC(300);
          System.out.println("a = " + t1.a + " b = " + t1.b);
          // System.out.println("c = " + t1.c);
          System.out.println("c = " + test.c);// thsi is the correct approach for accesing
          int op;
          // System.out.println("x1 = " +x1);
          System.out.println("x2 = " +x2);
          // System.out.println("op ="+op);
     }
}

