package grades;

public class StudentTest {
    public static void main(String[] args){
        Student one = new Student("Andres", 80);
        one.addGrade(80);
        one.addGrade(90);
        one.addGrade(70);
        one.addGrade(80);
        System.out.println(one.getGradeAverage());
    }
}
