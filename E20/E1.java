package lecturesHomework.E20;

public class E1 {
    public static void main(String[] args) {
        E1Sqare e1Sqare = new E1Sqare(
                new Point(0,0),
                new Point(5,0),
                new Point(5,5),
                new Point(0,5)
                 //
                );
        System.out.println(e1Sqare.getDescription());
    }
}
