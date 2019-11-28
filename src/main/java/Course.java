import java.time.DateTimeException;
import java.time.LocalDateTime;

public class Course {
    private String          name;
    private Module[]        modules;
    private Student[]       students;
    private LocalDateTime   startDate;
    private LocalDateTime   endDate;

    public Course(String name, Module[] modules, Student[] students, LocalDateTime startDate,LocalDateTime endDate) throws DateTimeException{
        if(endDate.isBefore(startDate)){
            throw new DateTimeException(endDate.toString() +" is before "+ startDate.toString());
        }
        this.name    = name;
        this.modules = modules;
        this.students= students;
        this.startDate= startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Module[] getModules() {
        return modules;
    }

    public void setModules(Module[] modules) {
        this.modules = modules;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
}
