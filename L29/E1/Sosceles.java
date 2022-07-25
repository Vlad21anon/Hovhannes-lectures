package lecturesHomework.L29.E1;

public class Sosceles implements TriangleChain {
    @Override
    public boolean isValidTriangle(Triangle triangle) {
        return triangle.sideA==triangle.sideC;
    }

    @Override
    public float getTriangleArea(Triangle triangle) {
        float sideBase = (triangle.sideA== triangle.sideB?
                triangle.sideC:(triangle.sideA== triangle.sideC?
                triangle.sideB : triangle.sideA) )/2;
        float sideBorder = triangle.sideA==triangle.sideB? triangle.sideA : triangle.sideC;
        float h = (float) Math.sqrt(sideBorder*sideBorder - (sideBase*sideBase));
        float area = sideBase*h;
        System.out.println("Sosceles");
        return area;
    }
}
