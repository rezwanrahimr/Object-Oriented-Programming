package constructors;

public class constructors {
    String name;
    int roll;
    String position;
    // constructor one
    constructors(String name,int roll){
        this.name = name;
        this.roll = roll;
    }

    // constructor two
    constructors(String name, int roll,String position){
        this(name,roll);
        this.position = position;
    }
    void displayOne(){
        System.out.println("Hello world");
    }
    void display(){
        displayOne();
        System.out.println("name : " + name + "\n" + "Roll : " + roll + "\n" + "position : " + position);
    }
}
