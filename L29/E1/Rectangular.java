package lecturesHomework.L29.E1;

public class Rectangular implements TriangleChain{

    @Override
    public boolean isValidTriangle(Triangle triangle) {
        return (triangle.sideA*triangle.sideA+triangle.sideB*triangle.sideB)==triangle.sideC*triangle.sideC?true:
                (triangle.sideC*triangle.sideC+triangle.sideB*triangle.sideB)==triangle.sideA*triangle.sideA?true:
                (triangle.sideA*triangle.sideA+triangle.sideC*triangle.sideC)==triangle.sideB*triangle.sideB?true: false;

    }

    @Override
    public float getTriangleArea(Triangle triangle) {
        float result = triangle.sideA>triangle.sideB&&triangle.sideA>triangle.sideC?
                triangle.sideB*triangle.sideC:
                (triangle.sideB>triangle.sideA&&triangle.sideB>triangle.sideC?
                        triangle.sideA* triangle.sideC:triangle.sideA* triangle.sideB);
        System.out.println("Rectangular");
        return result/2;
    }
}
