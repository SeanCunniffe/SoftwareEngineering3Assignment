import org.junit.jupiter.api.Test;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.LocalDate;

public class myTest {
    private static Logger LOGGER = Logger.getLogger(myTest.class.getName());
    @Test
    public void StudentConcatMethod(){
        LocalDate date = LocalDate.of(00,11,02);
        Student student = new Student("John",5,date,
                3,null,null);
        String testString = student.getName().concat(date.toString());
        if(!testString.equals(student.getUsername())){
            LOGGER.log(Level.WARNING,testString+" does not equal "+ student.getUsername());
        }
    }
}
