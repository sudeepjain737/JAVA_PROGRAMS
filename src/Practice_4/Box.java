package Practice_4;

import java.util.Scanner;

public class Box {
    int height;
    int width;
    int depth;

    Box(int h,int w,int d){
        height=h;
        width=w;
        depth=d;
    }
    public void volume(){
        System.out.println(height*width*depth);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Height: ");
        int h = input.nextInt();
        System.out.print("Enter Width: ");
        int w = input.nextInt();
        System.out.print("Enter Depth: ");
        int d = input.nextInt();
        Box b1 = new Box(h,w,d);
        System.out.print("Volume: ");
        b1.volume();
    }
}
