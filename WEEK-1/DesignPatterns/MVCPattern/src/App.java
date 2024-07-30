public class App {
    public static void main(String[] args) throws Exception {
        Student std = new Student("John Doe", "1", "A");
        StudentView view = new StudentView();
        StudentController ctrl = new StudentController(std, view);

        ctrl.update();

        ctrl.setStudentName("Jane Doe");
        ctrl.setStudentId("2");
        ctrl.setStudentGrade("B");

        ctrl.update();
    }
}
