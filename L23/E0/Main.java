package lecturesHomework.L23.E0;

public class Main {
    public static void main(String[] args) {
        //Figure[] figures = new Figure[3];
        FigureFactory factory = new FigureFactory();
        print(
                factory.create(2),
                factory.create(2,3),
                factory.create(2,3,4)
        );
    }

    public static void print(Figure... figures) {
        for (Figure figure: figures) {
            System.out.println(figure.toString());
        }

    }

    public static void print(String text) {
        System.out.println(text);
    }
}
