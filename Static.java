class test{
     int a = 10, b =11;
     static int c = 12;
}
public class Static {
     public static void main(String[] args) {
          test t1 = new test();
          System.out.println("a = " + t1.a + " b = " + t1.b);
          // System.out.println("c = " + t1.c);
          System.out.println(" c = " + test.c);// thsi is the correct approach for accesing
          
     }
}

