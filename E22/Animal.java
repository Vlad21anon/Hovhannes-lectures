package lecturesHomework.L21.E22;

public abstract class Animal {
    final String type;
    protected final String name;
    protected String move;

    public Animal(String name, String move) {
        this.type = getType();
        this.name = name;
        this.move = move;
    }

    private String getType() {
        return getClass().getSimpleName();
    }


    public String toString() {
        return getType() + " with name " + name + " now " + move;
    }
}
