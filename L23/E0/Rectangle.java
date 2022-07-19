package lecturesHomework.L23.E0;

public class Rectangle extends Figure{

    public Rectangle(double a, double b) {
        super(new double[] {a,b});
    }
    @Override
    public double getPerimetr() {
        return 2*super.getPerimetr();
    }
    @Override
    protected String getType() {
        return "Прямоугольник";
    }
    @Override
    protected double getArea() {
        return sides[0]*sides[1];
    }
    @Override
    public String toString(){
        return getType() + " площадь: " + getArea();
    }
}
