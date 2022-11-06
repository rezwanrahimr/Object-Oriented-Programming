package Interface;
public interface A {

    void draw();
    default void message(){
        System.out.println("defult method");
    }
}