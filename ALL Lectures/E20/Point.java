package lecturesHomework.E20;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getDistanceTo(Point other){
        int timevarX = (x- other.x)>0?(x- other.x):(other.x-x);
        int timevarY = (y- other.y)>0?(y- other.y):(other.y-y);
        return (int) timevarX+timevarY;
    }
}
