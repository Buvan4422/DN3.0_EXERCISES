public class SLL {
    private Node head;

    private class Node {
        Task task;
        Node nxt;

        Node(Task task) {
            this.task = task;
            this.nxt = null;
        }
    }

    public void add(Task task) {
        Node nn = new Node(task);
        if (head == null) {
            head = nn;
        } else {
            Node cur = head;
            while (cur.nxt != null) {
                cur = cur.nxt;
            }
            cur.nxt = nn;
        }
        System.out.println("Task " + task.getTaskName() + " added.");
    }

    public Task srch(int taskId) {
        Node cur = head;
        while (cur != null) {
            if (cur.task.getTaskId() == taskId) {
                return cur.task;
            }
            cur = cur.nxt;
        }
        return null;
    }

    public void traverss() {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.task);
            cur = cur.nxt;
        }
    }

    public void del(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }
        if (head.task.getTaskId() == taskId) {
            head = head.nxt;
            System.out.println("Task with ID " + taskId + " deleted.");
            return;
        }
        Node cur = head;
        while (cur.nxt != null && cur.nxt.task.getTaskId() != taskId) {
            cur = cur.nxt;
        }
        if (cur.nxt == null) {
            System.out.println("Task with ID " + taskId + " not found.");
        } else {
            cur.nxt = cur.nxt.nxt;
            System.out.println("Task with ID " + taskId + " deleted.");
        }
    }
}