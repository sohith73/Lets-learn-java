class Box{

int length, breadth ,height;
void setValue(int x ,int y ,int z){
     length = x;
     breadth = y;
     height = z;
}
void showValue(){
     System.out.println("Length : " + length);
     System.out.println("breadth : " +breadth);
     System.out.println("height : " + height);
}

}
public class OOp {
     public static void main(String[] args) {
          Box box = new Box();
          box.setValue(10,20,30);
          box.showValue();
     }
}
