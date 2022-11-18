package revision.staticMethod;

public class Child extends Parent{
  static void m1(){
        System.out.println("From parent static");
    }
    public void m2(){
        System.out.println("From parent non-static");
    }
}
