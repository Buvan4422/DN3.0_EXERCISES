public class Task {
    private int tId;
    private String tName;
    private String stat;

    public Task(int tId, String tName, String stat) {
        this.tId = tId;
        this.tName = tName;
        this.stat = stat;
    }

    public int getTaskId() { return tId; }
    public String getTaskName() { return tName; }
    public String getStatus() { return stat; }

    @Override
    public String toString() {
        return "Task ID: " + tId + ", Task Name: " + tName + ", Status: " + stat;
    }
}