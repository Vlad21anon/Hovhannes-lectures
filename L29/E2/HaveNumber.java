package lecturesHomework.L29.E2;

public class HaveNumber extends Validation.Abstract{
    protected HaveNumber() {
        super("Нет числа в строке");
    }

    @Override
    public boolean isValidInner(String password) {
        return password.contains("1") ||password.contains("2") ||password.contains("3")||password.contains("4")
                ||password.contains("5") ||password.contains("6")||password.contains("7")||password.contains("8")
                ||password.contains("9")||password.contains("0");
    }
}
