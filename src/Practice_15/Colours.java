package Practice_15;

public class Colours implements Runnable{
    public void run(){
        String colours[] = {"white","blue","black","green","red","yellow"};
        double k = Math.random()*6;
        int j = (int) k;
        while (colours[j].equals("red")==false){
            System.out.println(colours[j]);
            double k1 = Math.random()*6;
            j = (int) k1;

        }
    }

    public static void main(String[] args) {
        Colours c1 = new Colours();
        Thread t1 = new Thread(c1);
        t1.start();
    }
}
