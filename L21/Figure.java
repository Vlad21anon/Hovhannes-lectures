package lecturesHomework.L21;

public abstract class Figure {
    protected final double[] sides;
    final String type;

    protected Figure( double[] sides) {
        this.sides = sides;
        this.type = getType();
    }

    protected String getType() {
        return getClass().getSimpleName();
    }

    protected double getPerimetr() {
        double perimetr = 0;
        for(double side : sides) {
            perimetr+=side;
        }
        return perimetr;
    }
    protected abstract double getArea();

    public String toString() {
        return getType() + "-area: " + getArea() + ", perimetr: " + getPerimetr();
    }

}
