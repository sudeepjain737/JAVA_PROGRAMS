package Practice_15;

public class Numbers extends Thread{
    public void run(){
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
            if(i==5){
                try {
                    sleep(5000);
                }catch (InterruptedException obj){
                    System.out.println(obj);
                }
            }
        }
    }

    public static void main(String[] args) {
        Numbers n1 = new Numbers();
        n1.start();
    }
}
