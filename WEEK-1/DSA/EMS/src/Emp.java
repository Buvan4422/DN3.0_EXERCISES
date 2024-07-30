public class Emp {
    private int eid;
    private String name;
    private String pos;
    private double sal;

    public Emp(int eid, String name, String pos, double sal) {
        this.eid = eid;
        this.name = name;
        this.pos = pos;
        this.sal = sal;
    }

    public int getEmpId() { return eid; }
    public String getName() { return name; }
    public String getPosition() { return pos; }
    public double getSalary() { return sal; }

    @Override
    public String toString() {
        return "Emp [employeeId=" + eid + ", name=" + name + ", position=" + pos + ", salary=" + sal + "]";
    }
}