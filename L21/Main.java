package lecturesHomework.L21;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Circle(10);
        figures[1] = new Triangle(10,10,15);
        figures[2] = new Rectangle(10,10);

        for(Figure figure: figures) {
            System.out.println(figure.toString());
        }
    }
}
