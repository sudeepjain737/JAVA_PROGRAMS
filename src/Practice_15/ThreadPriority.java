package Practice_15;

class Thread1 extends Thread {
    Thread1(String s) {
        super(s);
    }

    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("Thread1" + "-->" + i);
        }
    }
}
class Thread2 extends Thread {
    Thread2(String s) {
        super(s);
    }

    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("Thread2" + "-->" + i);
        }
    }
}
    class Thread3 extends Thread {
        Thread3(String s) {
            super(s);
        }

        public void run() {
            for (int i = 1; i < 11; i++) {
                System.out.println("Thread3" + "-->" + i);
            }
        }
    }

public class ThreadPriority extends Thread{
    public static void main(String[] args) {
        Thread1 t1 = new Thread1("Thread-1");
        Thread2 t2 = new Thread2("Thread-2");
        Thread3 t3 = new Thread3("Thread-3");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
//public class ThreadPriority implements Runnable {
//    public void run(){
//        for (int i = 1; i < 201; i++) {
//            System.out.println(Thread.currentThread().getName() + "--->" + i);
//        }
//    }
//    public static void main(String[] args) {
//        ThreadPriority t = new ThreadPriority();
//        Thread t1 = new Thread(t,"Thread1");
//        Thread t2 = new Thread(t,"Thread2");
//        Thread t3 = new Thread(t,"Thread3");
//        t1.setPriority(Thread.MAX_PRIORITY);
//        t2.setPriority(Thread.MIN_PRIORITY);
//        t3.setPriority(Thread.NORM_PRIORITY);
//        t1.start();
//        t2.start();
//        t3.start();
//    }

