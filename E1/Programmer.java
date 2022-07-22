package lecturesHomework.L25.E1;

public class Programmer extends Worker{

    protected Programmer(String essenceExercise) {
        super(essenceExercise);
    }

    @Override
    protected String senseExercise() {
        return "Я - программист, сделал: " + essenceExercise;
    }
}
