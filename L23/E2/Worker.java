package lecturesHomework.L23.E2;

public abstract class Worker {
    protected final int experience;
    protected final int salary;
    final String type;

    protected Worker(int salary, int experience) {
        this.salary = salary;
        this.experience = experience;
        this.type = getType();
    }

    protected String getType() {
        return getClass().getSimpleName();
    }

    public String toString() {
        return "Человек хочет себе " + salary + "$ когда его опыт " + experience + " лет. что является уровнем "+getType();
    }

}
