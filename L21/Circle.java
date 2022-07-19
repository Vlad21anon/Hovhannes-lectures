package lecturesHomework.L21;

public class Circle extends Figure {

    public Circle(double radius) {
        super(new double[]{radius});
    }
    @Override
    public double getPerimetr() {
        return 3.14*2*sides[0];
    }
    @Override
    public double getArea() {
        return 3.14*sides[0]*sides[0];
    }
}
