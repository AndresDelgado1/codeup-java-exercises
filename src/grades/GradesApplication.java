package grades;
import java.util.HashMap;
import util.Input;
import java.util.Map;

public class GradesApplication {
    public static void main(String[] args) {


        HashMap<String, Student> students = new HashMap<String, Student>();
        Student one = new Student("Andres");
        one.addGrade(80);
        one.addGrade(90);
        one.addGrade(95);

        Student two = new Student("Ethan");
        two.addGrade(85);
        two.addGrade(94);
        two.addGrade(93);

        Student three = new Student("Jeffrey");
        three.addGrade(82);
        three.addGrade(93);
        three.addGrade(96);

        Student four = new Student("Rajib");
        four.addGrade(87);
        four.addGrade(97);
        four.addGrade(91);



        students.put("Maveric", one);
        students.put("Goose", two);
        students.put("Iceman", three);
        students.put("Viper", four);


        System.out.println("Welcome!\n" + "\n" + "Here are the GitHub usernames of our Students:\n");

        for (Map.Entry<String, Student> student : students.entrySet()) {
            System.out.print("|" + student.getKey() + "|  ");
        }
        System.out.println("\n\nWhat student would you like to see more information on?");
        boolean run = true;
        while (run) {
            Input a = new Input();
            String input = a.getString();
//            if (students.containsKey(input)) {
            for (Map.Entry<String, Student> set : students.entrySet()) {
                if (input.equalsIgnoreCase(set.getKey())) {
                    System.out.println("Name: " + set.getValue().getName() + " - "
                            + "Github Username: " + set.getKey() +
                            "\n" + "Current Average: " + set.getValue().getGradeAverage());
//                    }

                    System.out.println("\n Would you like to see another student? Y/N");
                } else if (input.equalsIgnoreCase("n")) {
                    System.out.println("Thank you and Have a wonderful day!");
                    break;
                }
                else {
                    System.out.printf("Sorry, no student found with the Github username of %s" + "\n" +
                            "Would you like to see another student?", input);
                }

            }


        }

    }
}


