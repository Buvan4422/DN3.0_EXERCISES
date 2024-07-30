public class Main {
    public static void main(String[] args) {
        SLL lst = new SLL();

        // Adding tasks
        lst.add(new Task(1, "Design system architecture", "In Progress"));
        lst.add(new Task(2, "Develop front-end", "Pending"));
        lst.add(new Task(3, "Setup Server", "Completed"));
        lst.add(new Task(4, "Develope Authentication", "In Progress"));
        System.out.println();

        // Searching a task
        Task task = lst.srch(2);
        if (task != null) {
            System.out.println("Found: " + task);
        } else {
            System.out.println("Task not found.");
        }
        System.out.println();

        // Traversing tasks
        System.out.println("All tasks:");
        lst.traverss();
        System.out.println();

        // Deleting a task
        lst.del(3);
        System.out.println();

        // Traversing tasks again
        System.out.println("All tasks after deletion:");
        lst.traverss();
    }
}