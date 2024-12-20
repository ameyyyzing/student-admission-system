import org.multifaceted.org.multifaceted.service.StudentService;
import org.multifaceted.org.multifaceted.service.StudentServiceImpl;

public class Application {

    public static void main(String args[]){
        StudentService service = new StudentServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
