package Practice_8;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setX(int x){
        this.x = x;
        System.out.println(x + "  " + y);
    }
    public void setY(int y){
        this.y = y;
        System.out.println(x + " " + y);
    }
    public void setXY(int x,int y){
        this.x = x;
        this.y = y;
        System.out.println(x + "  " + y);
    }

    public static void main(String[] args) {
        Point p1 = new Point(2,3);
        System.out.println(p1.x + " " + p1.y);
        p1.setX(5);
        p1.setY(10);
        p1.setXY(10,20);
    }
}
