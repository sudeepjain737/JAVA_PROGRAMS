package Practice_6;

public class ClassRoom {
    boolean AC_ON,LIGHT_ON,FAN_ON,HOME_THEATRE_ON;

    public ClassRoom(boolean AC_ON, boolean LIGHT_ON, boolean FAN_ON, boolean HOME_THEATRE_ON) {
        this.AC_ON = AC_ON;
        this.LIGHT_ON = LIGHT_ON;
        this.FAN_ON = FAN_ON;
        this.HOME_THEATRE_ON = HOME_THEATRE_ON;
    }
    public int bill(){
        int s=0;
        if(AC_ON){
            s=s+1200;
        }
        if(FAN_ON){
            s=s+400;
        }
        if(LIGHT_ON){
            s=s+100;
        }
        if(HOME_THEATRE_ON){
            s=s+600;
        }
        return s;
    }

    public static void main(String[] args) {
        ClassRoom c1 = new ClassRoom(true,false,true,false);
        if(c1.bill()>2000){
            System.out.println("Overloaded");
        }
        else{
            System.out.println("Not Overloaded");
        }
    }
}
