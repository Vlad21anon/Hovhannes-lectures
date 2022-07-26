package lecturesHomework.L26.E0;

public class Designer extends Employee{
    protected Designer(TaskProgressCallback callback, String name) {
        super(callback, name, Task.Status.ASSEMBLING_REQUIREMENTS);
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(task.getId(), Task.Status.READY_TO_DO,
                task.getDescription(), getDesignLinkForTask(task.getId()),
                getTestCaseForTask(task.getDescription()), "");
    }

    private String getTestCaseForTask(String taskDescription) {
        return "when "+taskDescription+" get result" + Math.random();
    }

    private String getDesignLinkForTask(int taskId) {
        return "https://projects/design_link..."+taskId;
    }

    @Override
    protected String getDetails(Task task) {
        return "with taskId"+task.getId()+" and description "
                +task.getDescription();
    }
}
