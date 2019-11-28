public class Module {
    private String      name;
    private String      ID;
    private Student[]   students;
    private Course[]    courses;

    public Module(String name,String ID,Student[] students,Course[] courses){
        this.name    =name;
        this.ID      =ID;
        this.students=students;
        this.courses =courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}
