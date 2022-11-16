import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args){
//        addition(5, 5 );
//        subtraction(5, 5 );
//        multiplication(5, 5 );
//        division(5, 5 );
//        modulus(10, 2);
        getInteger(4, 10);
//        factorial();

    }

    public static void addition(int x, int y){

        System.out.println(x + y);
    }

    public static void subtraction(int x, int y){

        System.out.println(x - y);
    }

    public static void multiplication(int x, int y){

        System.out.println(x * y);
    }

    public static void division(int x, int y){

        System.out.println(x / y);
    }

    public static void modulus(int x, int y){

        System.out.println(x % y);
    }

    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter int");
        int input = sc.nextInt();
        if (input > max || input < min){
            System.out.println("invalid");
            return getInteger(min, max);
        }
        System.out.printf("You picked %s", input);
        return input;
    }

    public static void factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("pick a number from 1 to 10");
        int input = sc.nextInt();
        System.out.println("you picked " + input);
        System.out.println("do you want to continue?");
        String answer = sc.next();

        if(answer.equals("yes")){

            int sum = 1;
            for (int i = 1; i <= input; i++) {
                sum *= i;
                System.out.println(sum);
            }
//            System.out.println("factional is" + fact);
        }
    }
}


