package lecturesHomework.L26.E0;

public class Main {
    public static void main(String[] args) {
        TaskFactory factory = new TaskFactory();
        TaskProgressCallback callback = new CallbackImpl(factory);
        EmployeeChain chain = new EmployeeChain(
                new EmployeeChain(
                        new Designer(callback,"Alla"),
                        new Programmer(callback,"John")),
                new Tester(callback,"Steve")
        );

        while (true){
            if (!chain.doTask(factory.getTask())){
                break;
            }
        }

    }
}
