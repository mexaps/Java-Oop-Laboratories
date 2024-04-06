package lab2.task3;

public class Point {

    public float x;
    public float y;

    public Point(Float x, Float y){
        this.x=x;
        this.y=y;
    }
    void changeCoords(Float altx, Float alty){
        this.x=altx;
        this.y=alty;
    }
    void Afisare(){
        System.out.println("("x","y")");
    }
}
