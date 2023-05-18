package lab4.lab4_1;

public class LabledPoint extends Point{
    private String lable;
    public LabledPoint(String lable, int x, int y){
        super(x,y);
        this.lable=lable;
    }
    public String getLable(){
        return lable;
    }
}
