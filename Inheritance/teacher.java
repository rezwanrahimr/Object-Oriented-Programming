package Inheritance;

public class teacher extends person {
    int serialNo;


    teacher(String name,
    String propression,
    String location,int serialNo){
        this.name = name;
        this.propression = propression;
        this.location = location;
        this.serialNo =serialNo;
    }

  void dis2(){
    dis1();
    System.out.println("SerialNO : " + serialNo);

    }

}
