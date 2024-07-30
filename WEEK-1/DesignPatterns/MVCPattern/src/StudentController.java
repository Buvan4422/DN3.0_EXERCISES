public class StudentController {
    private Student md;
    private StudentView vw;

    public StudentController(Student md, StudentView vw) {
        this.md = md;
        this.vw = vw;
    }

    public void setStudentName(String name) {
        md.setName(name);
    }

    public String getStudentName() {
        return md.getName();
    }

    public void setStudentId(String id) {
        md.setId(id);
    }

    public String getStudentId() {
        return md.getId();
    }

    public void setStudentGrade(String grade) {
        md.setGrade(grade);
    }

    public String getStudentGrade() {
        return md.getGrade();
    }

    public void update() {
        vw.display(md.getName(), md.getId(), md.getGrade());
    }
}
