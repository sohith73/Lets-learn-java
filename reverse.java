class Reverse{
     public static void main(String[] args) {
          int num = 89088;
          while (num>0){
               System.out.print(num%10);
               num /= 10;
          }
     }
}