import java.time.LocalDate;
import java.time.LocalDateTime;

public class Student {
    private int             age;
    private LocalDate   DOB;
    private int             ID;
    private Course[]          courses;
    private Module[]        currentModules;
    private String name;

    public Student(String name, int age, LocalDate DOB, int
            ID, Course[] courses, Module[] currentModules){
             this.name = name;
             this.age            = age;
             this.DOB            = DOB;
             this.ID             = ID;
             this.courses        = courses;
             this.currentModules = currentModules;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return name.concat(DOB.toString());
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public Module[] getCurrentModules() {
        return currentModules;
    }

    public void setCurrentModules(Module[] currentModules) {
        this.currentModules = currentModules;
    }

    public String getName() {
        return name;
    }
}
