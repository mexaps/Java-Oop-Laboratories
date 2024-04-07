package lab2.task3;

public class Point {

    public float x;
    public float y;

    public Point(float x, float y){
        this.x=x;
        this.y=y;
    }
    void changeCoords(float x, Float y){
        this.x=x;
        this.y=y;
    }

    void afisare(){
        System.out.println("(" + x + ", " + y + ")");
    }

}
