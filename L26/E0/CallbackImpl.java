package lecturesHomework.L26.E0;

public class CallbackImpl implements TaskProgressCallback{
    private final TaskFactory taskFactory;

    public CallbackImpl(TaskFactory taskFactory) {
        this.taskFactory = taskFactory;
    }

    @Override
    public void updateTask(Task task) {
        taskFactory.updateTask(task);
    }
}
