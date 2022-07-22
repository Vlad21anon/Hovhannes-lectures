package lecturesHomework.L25.E1;

public abstract class Worker {
    protected final String essenceExercise;

    protected Worker(String essenceExercise) {
        this.essenceExercise = essenceExercise;
    }

    protected abstract String senseExercise();

    public String toString() {
        return senseExercise();
    }

}
