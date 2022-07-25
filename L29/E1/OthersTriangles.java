package lecturesHomework.L29.E1;

public class OthersTriangles implements TriangleChain {

    @Override
    public boolean isValidTriangle(Triangle triangle) {
        return true;
    }

    @Override
    public float getTriangleArea(Triangle triangle) {
        float p = (triangle.sideA+ triangle.sideB+ triangle.sideC)/2;
        System.out.println("other");
        return (float) Math.sqrt(p*(p-triangle.sideA)*(p-triangle.sideB)*(p-triangle.sideC));
    }
}
