public class ControlFlowExercises {
    public static void main(String[] args) {
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


        for ( int i = 1; i <= 100; i++) {
//            System.out.println(i);
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }

            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }

    }
}
