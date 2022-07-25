package lecturesHomework.L29.E1;

public class Chain implements TriangleChain {
    private final TriangleChain validation1;
    private final TriangleChain validation2;

    public Chain(TriangleChain validation1, TriangleChain validation2) {
        this.validation1 = validation1;
        this.validation2 = validation2;
    }


    @Override
    public boolean isValidTriangle(Triangle triangle) {
        return validation1.isValidTriangle(triangle);
    }

    @Override
    public float getTriangleArea(Triangle triangle) {
        if (validation1.isValidTriangle(triangle)) {
            return validation1.getTriangleArea(triangle);
        } else {
            return validation2.getTriangleArea(triangle);
        }
    }


}
