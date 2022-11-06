package Interface;

public class B implements A {
    public void draw(){
        System.out.println("Hello This is B");
    }
    
    public static void main(String [] args){
        A us;
        us = new B();
        us.message();
        us.draw();

    }
}
