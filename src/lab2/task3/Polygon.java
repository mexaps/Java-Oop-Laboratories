package lab2.task3;

public class Polygon {

    public Integer n;
    public Point[] points;

    public Polygon(Integer n){
        points= new Point[n];
    }

    public Polygon(float[] points1){
        this(points1.length / 2);
        int len = points1.length;
        int p = 0;
        for (int i = 0; i < len; i += 2) {
            points[p] = new Point(points1[i], points1[i + 1]);
            ++p;
        }
    }





}
