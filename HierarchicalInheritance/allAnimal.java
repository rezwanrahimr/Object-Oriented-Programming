package HierarchicalInheritance;

public class allAnimal extends dog{
    
    public void Display(){
        disAnimal();
        disDog();
    }


    public static void main(String [] args){
        allAnimal obj =  new allAnimal();
        obj.Display();
    }
}
