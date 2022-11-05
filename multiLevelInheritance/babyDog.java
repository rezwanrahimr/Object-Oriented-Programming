package multiLevelInheritance;

public class babyDog extends dog{
    void BabyDog(){
        System.out.println("Baby Dog..");
    }

    void display(){
        dis();
        disDog();
        BabyDog();
    }

    public static void main(String [] args){
        babyDog obj = new babyDog();
        obj.display();

    }
}
