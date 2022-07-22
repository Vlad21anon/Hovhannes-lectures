package lecturesHomework.L25.E1;

public class Main {
    public static void main(String[] args) {

        print(
                Exercise.createExercise("Programmer","создать новый класс"),
                Exercise.createExercise("Tester","написать тест для класса программиста"),
                Exercise.createExercise("Designer","Создать внешнюю часть нового функционала")
        );


        System.out.println();
    }


    public static void print(Worker... exercises) {
        for (Worker exercise: exercises) {
            System.out.println(exercise.toString());
        }
    }
    public static void print(String text) {
        System.out.println(text);
    }

}
