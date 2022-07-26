package lecturesHomework.L26.E0;

public class Tester extends Employee{
    protected Tester(TaskProgressCallback callback, String name) {
        super(callback, name, Task.Status.READY_FOR_TESTING);
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(task.getId(),
                Task.Status.DONE,
                task.getDescription(),
                task.getDesignLink(),
                task.getTestCase(),
                task.getBuildLink() );
    }

    @Override
    protected String getDetails(Task task) {
        return "with id "+task.getId()+" add testcase "
                +task.getTestCase();
    }
}
