package practice;

public class Student {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++){
            LPAStudent s = new LPAStudent("1" + 1,
                    switch (i){
                    case 1 -> "marry";
                    case 2 -> "Carol";
                    case 3 -> "Tim";
                    default -> "Anonymous";
                    },
                    "05/11/1984",
                    "java");
            System.out.println(s);
        }

        Student pojoStudent = new Student ("s923006", "Ann", "05/11/1985", "java");
        LPAStudent recordStudent = new LPAStudent ("s923007", "Bill", "05/11/1985", "java");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        Student a = new Student("2", "Anders", "May 2, 1997", "Math");
        a.toString();
    }





    private String id;

    private String name;
    private String dateOfBirth;
    private String classList;

    public Student(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

//    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }
}
