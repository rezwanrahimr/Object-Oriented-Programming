package revision.Interface;

public class multiInterface implements A,B{
  /*   public void print(){
        System.out.println("This is A");
    }
    public void show(){
        System.out.println("THis is B");
    } */

    public void print(){
        System.out.println("Hello world how are you");
    }

    public static void main(String [] args){
        multiInterface obj = new multiInterface();
        obj.print();
        obj.mes();
        System.out.println(B.calculate(5));
       
    }
}
