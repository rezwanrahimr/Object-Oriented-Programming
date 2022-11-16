package Lab.problem4;
public class areaOfaCircle {
    areaOfaCircle(int radius){
        double area = Math.PI*(radius*radius);
        System.out.println("Area of Circle : " + area);
    }
    public static void main(String [] args){
        areaOfaCircle obj = new areaOfaCircle(5);

    }
}
