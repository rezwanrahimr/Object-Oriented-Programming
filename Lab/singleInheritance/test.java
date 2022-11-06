package Lab.singleInheritance;

public class test extends person {
    void display(){
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Position : " + position);

    }
    public static void main(String [] args){
        test obj = new test();
        obj.id = 1;
        obj.name = "Rezwan Rahim";
        obj.position = "Jr Developer";
        obj.display();
    }
}
