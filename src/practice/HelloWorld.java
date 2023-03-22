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



//--------------------------------doubles and floats-----------------------------
//        doubles are the default data type for decimal numbers
//        *float myFloatNumber = 5.25;* this fails because the program is trying to fit a double into a float
        float myFloatNumber = 5.25f;


        double numberOfPounds = 200d;
        double convertedKilos = numberOfPounds * 0.453d;
        System.out.println("converted kilos = " + convertedKilos);



//--------------------------------char and booleans------------------------------
        char myChar = 'D';

        char mySimpleChar = '?';
//        unicode is the code assigned to a specific character, below is the unicode for a question mark
        char myUnicodechar = '\u003f';



//--------------------------------Strings------------------------------

        String myString = "This is a string";
        System.out.print("myString is equal to " + myString);

        String numberString = "250.55";

        String lastString = "10";
        int myint = 50;
        lastString = lastString + myint;
        System.out.println(lastString);


        String myFirstName = "Andres";
        String myLastName = "Delgado";
        String myName = "My name is " + myFirstName + " " + myLastName;
        System.out.println(myName);



//--------------------------------Switch Statements------------------------------
        int switchValue = 2;
        switch (switchValue) {
            case 1 -> System.out.println("value was 1");
            case 2 -> System.out.println("value was 2");
            default -> System.out.println("was not 1 or 2");
        }



        String month = "x";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }
    public static String getQuarter(String month) {
//        switch (month) {
//            case "January":
//            case "February":
//            case "March":
//                return "1st";
//            case "April":
//            case "May":
//            case "June":
//                return "2nd";
//
//        }
//        return "bad";
        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }

}
