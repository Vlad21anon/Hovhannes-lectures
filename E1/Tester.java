package lecturesHomework.L25.E1;

public class Tester extends Worker{

    protected Tester(String essenceExercise) {
        super(essenceExercise);
    }

    @Override
    protected String senseExercise() {
        return "Я - тестер, сделал: " + essenceExercise;
    }
}
