package lecturesHomework.L29.E2;

public class NotNull implements Validation{

    @Override
    public boolean isValid(String password) {
        return password!=null;
    }
}
