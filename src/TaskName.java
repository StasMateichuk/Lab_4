public class TaskName {
    private final String taskName;

    public TaskName(String taskName) {
        this.taskName = taskName;
    }

    public void printTaskNameInfo() {
        System.out.println("\n-------------------------------------------------------");
        System.out.println(taskName);
        System.out.println("-------------------------------------------------------");
    }
}