package singleInheritance;

public class dog extends animal {
    void disDog(){
        System.out.println("Dog...");
    }

    public static void main(String[] args) {
        dog obj = new dog();
        obj.dis();
        obj.disDog();
    }
}
