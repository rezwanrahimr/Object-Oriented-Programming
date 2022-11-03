package encapsulation;

public class encap {
    public static void main(String[] args) {
        person obj = new person();
        obj.setMethod("Hello world");
        
             System.out.println(obj.getMethod());
         }
}
