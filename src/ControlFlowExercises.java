import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


//        int i = 5;
//        while(i <= 15) {
//            System.out.println(i);
//            i++;
//        }


//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);


//        int i =100;
//        do{
//            System.out.println(i);
//            i -= 5;
//        }
//        while (i >= 10);


//        long i =2;
//        do{
//            System.out.println(i);
//            i *= i;
//        }
//        while (i <= 1000000);


//        for ( int i = 1; i <= 100; i++) {
////            System.out.println(i);
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            }
//
//            else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            }
//            else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            }
//            else{
//                System.out.println(i);
//            }
//        }


//        System.out.println("Input a grade");
//        int userGrade = sc.nextInt();
//        System.out.println("Would you like to continue?");
//        String userAnswer = sc.next();
//        if(userAnswer.equals("yes")) {
//            if (userGrade >= 88) {
//                System.out.println("A");
//            } else if (userGrade >= 80) {
//                System.out.println("B");
//
//            } else if (userGrade >= 67) {
//                System.out.println("C");
//            } else if (userGrade >= 60) {
//                System.out.println("D");
//            } else {
//                System.out.println("F");
//            }
//        }else{
//            System.out.println("Please confirm to see grade");
//        }


        System.out.println("What number would you like to go up to?");
        int userNumber = sc.nextInt();
        System.out.println("would you like to continue?");
        String userAnswer = sc.next();
        if( userAnswer.equals("yes")){
            System.out.println("number | squared | cubed");
            for (int i = 1; i <= userNumber; i++) {
                System.out.println(i + "      | " + (i * i) + "       | " + (i * i * i));
            }
        } else {
            System.out.println("Sucks to suck");
        }
    }
}
