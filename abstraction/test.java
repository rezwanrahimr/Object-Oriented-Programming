package abstraction;

public class test {
    
    public static void main(String [] args){
        mobileUser us;
        us = new rahim();
        us.call();
        us.sendMessage();

        us = new karim();
        us.call();
        us.sendMessage();
    }
}
