package lecturesHomework.L25.E1;

public class Exercise {
    public static Worker createExercise(String forWho, String essenceExercise) {
        switch (forWho){
            case "Programmer":
                return new Programmer(essenceExercise);

            case "Tester":
                return new Tester(essenceExercise);

            case "Designer":
                return new Designer(essenceExercise);
            default:
                throw new IllegalArgumentException("I don't understand");
        }
    }
}
