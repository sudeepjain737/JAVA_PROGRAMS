package Practice_15;

class Even extends Thread{
    public void run(){
        for (int i = 1; i < 21; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}

class Odd extends Thread{
    public void run(){
        for (int i = 1; i < 21; i++) {
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}

public class UseOfJoin {
    public static void main(String[] args) throws InterruptedException {
        Even e1 = new Even();
        Odd o1 = new Odd();
        e1.start();
        //Thread mainThread = Thread.currentThread();
        e1.join();
        o1.start();

    }
}
