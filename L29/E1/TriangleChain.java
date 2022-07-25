package lecturesHomework.L29.E1;

public interface TriangleChain {
    boolean isValidTriangle(Triangle triangle);
    float getTriangleArea(Triangle triangle);

    abstract class Abstract implements TriangleChain {

        @Override
        public boolean isValidTriangle(Triangle triangle){
            boolean success = isValidTriangleInner(triangle);
            return success;
        }

        @Override
        public abstract float getTriangleArea(Triangle triangle);

        protected abstract boolean isValidTriangleInner(Triangle triangle);
    }
}
