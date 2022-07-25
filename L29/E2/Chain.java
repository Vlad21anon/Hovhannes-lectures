package lecturesHomework.L29.E2;

public class Chain implements Validation {
    private final Validation validation1;
    private final Validation validation2;

    public Chain(Validation validation1, Validation validation2) {
        this.validation1 = validation1;
        this.validation2 = validation2;
    }

    @Override
    public boolean isValid(String text) {
        if (validation1.isValid(text)) {
            return validation2.isValid(text);
        } else {
            return false;
        }
    }

}
