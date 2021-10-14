package Practice_9;

import java.util.Random;

public abstract class Instrument
{
    public abstract void play();
}

class Piano extends Instrument
{
    public void play()
    {
        System.out.println("Piano is playing tan tan tan tan");
    }
}
class Flute extends Instrument
{
    public void play()
    {
        System.out.println("Flute is playing toot toot toot toot");
    }
}
class Guitar extends Instrument
{
    public void play()
    {
        System.out.println("Guitar is playing tin tin tin tin");
    }
}

class Result {
    public static void main(String[] args) {
        Instrument arr[] = new Instrument[10];
        ;
        for (int i = 0; i < 10; i++) {
            double k = Math.random()*3;
            int n= (int) k;
            if (n == 0)
            {
                arr[i] = new Piano();
            }
            else if (n == 1)
            {
                arr[i] = new Flute();
            }
            else if (n == 2)
            {
                arr[i] = new Guitar();
            }
            arr[i].play();
        }
        System.out.println();
        System.out.println("<<-------------------------------------->>");
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (arr[i] instanceof Piano) {
                System.out.println("Piano class at index:" + i);
            } else if (arr[i] instanceof Guitar) {
                System.out.println("Guitar class at index:" + i);
            } else if (arr[i] instanceof Flute) {
                System.out.println("Flute class at index:" + i);
            }
        }
    }
}

