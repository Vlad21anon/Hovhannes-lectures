package lecturesHomework.E20;

public class E1Sqare {
    protected final int sideA;
    protected final int sideB;
    protected final int sideC;
    protected final int sideD;
    //A    B
    //
    //
    //C    D
    public E1Sqare(Point a, Point b, Point c, Point d) {
        this(a.getDistanceTo(b), a.getDistanceTo(c), d.getDistanceTo(c),d.getDistanceTo(b));
    }

    private E1Sqare(int sideA, int sideB, int sideC, int sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }
    public String getDescription(){
        return isRightSquare()?"Квадрат":"Не квадрат";

    }
    private boolean isRightSquare(){
        return this.sideA*2 == this.sideB && this.sideB == this.sideC*2 && this.sideC*2 == this.sideD;

    }


}
