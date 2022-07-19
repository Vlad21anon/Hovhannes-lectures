package lecturesHomework.L18;

public class E3 {
    private static final lessonIsCompleteE3[] lessonIsCompleteE3 = new lessonIsCompleteE3[] {
            new lessonIsCompleteE3(1,true),
            new lessonIsCompleteE3(2,true),
            new lessonIsCompleteE3(3,false),
            new lessonIsCompleteE3(4,true),
    };

    public static void main(String[] args) {
        for (int i = 0; i < lessonIsCompleteE3.length; i++) {
            String text = "";
            if (lessonIsCompleteE3[i].isFinish){
                text = "завершенным";
            }else {
                text = "не завершенным";
            }
            System.out.println("Урок под номером "
                    + lessonIsCompleteE3[i].numberLesson
                    + " является "
                    + text);
        }
    }
}
