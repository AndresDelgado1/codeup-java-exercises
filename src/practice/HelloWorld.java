package practice;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("hello");

        int x = 5;
        System.out.print(x);

        x = 1000;
        System.out.println(x);


        int v = Integer.MIN_VALUE;



        short myShort = Short.MAX_VALUE;
        System.out.println(myShort + x);



        int z = x + v;

        short myMinShort = Short.MIN_VALUE; int myMinInt = Integer.MIN_VALUE;
        System.out.println(myMinInt);
        System.out.println(myMinShort);


        System.out.println(z);








//        -----------   CASTING ---------------
        short newShort = (short) (myMinShort / 2);
//        if you dont use (short) error occurs because it cant evaluate if number fits inside a short
        System.out.println(newShort);





    }
}
