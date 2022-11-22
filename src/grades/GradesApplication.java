package grades;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {


        HashMap<String, Student> usernames = new HashMap<>();
        Student Andres = new Student("Andres");
        Andres.addGrade(80);
        usernames.put("ryanorsinger", Andres);
//        usernames.put("zgulde", );
//        usernames.put("fmendozaro", );
//        usernames.put("jreich5", );



    }
}
