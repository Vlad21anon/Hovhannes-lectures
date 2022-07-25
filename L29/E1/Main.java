package lecturesHomework.L29.E1;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(8,9,10);
        Chain chain1 = new Chain(new Equilateral(), new Sosceles());
        Chain chain2 = new Chain(new Rectangular(), new OthersTriangles());
        Chain allChain = new Chain(chain1,chain2);
        System.out.println(allChain.getTriangleArea(triangle));
    }
}
