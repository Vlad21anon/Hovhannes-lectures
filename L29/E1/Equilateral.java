package lecturesHomework.L29.E1;

public class Equilateral implements TriangleChain {

    @Override
    public boolean isValidTriangle(Triangle triangle) {
        return triangle.sideA==triangle.sideB&& triangle.sideB==triangle.sideC;
    }

    @Override
    public float getTriangleArea(Triangle triangle) {
        System.out.println("Equilateral");
        return (float) ((triangle.sideA* triangle.sideA*
                Math.sqrt(3))/4);
    }
}
