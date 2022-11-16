package revision.Interface;

public interface B {
//     public void show();
       public void print();

       default public void mes(){
        System.out.println("This is message ");
       }
       static public int calculate (int a){
            return a*a;
       }
}

