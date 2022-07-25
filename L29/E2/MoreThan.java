package lecturesHomework.L29.E2;

public class MoreThan extends Validation.Abstract{
    private final int minLength;

    public MoreThan(int minLength) {
        super("недостаточно символов");
        this.minLength = minLength;
    }


    @Override
    protected boolean isValidInner(String password) {
        return password.length()>=minLength;
    }
}
