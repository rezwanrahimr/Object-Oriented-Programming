package Interface;
public interface A {

    void draw();
    default void message(){
        System.out.println("defult method");
    }
    static int message2(int x){
        int sum = x;
        return sum;
    }
}