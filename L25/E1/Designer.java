package lecturesHomework.L25.E1;

public class Designer extends Worker{

    protected Designer(String essenceExercise) {
        super(essenceExercise);
    }

    @Override
    protected String senseExercise() {

        return "Я - дизайнер, сделал: " + essenceExercise
            + "\nЯ - Дизайнер. Даю новое задание программисту"
            + "\n"+createNewExercises("Programmer","добавить функционал к кнопке");
    }
    protected Worker createNewExercises(String forWho,String essenseNewExercise){//Тут можно указать новую задачу кому-либо
        return Exercise.createExercise(forWho,essenseNewExercise);
    }
}
