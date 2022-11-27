package util;
import java.util.Scanner;

public class Input {
    private Scanner sc;

    public Input(){
        this.sc = new Scanner(System.in);
    }

    public String getString(){
        return sc.nextLine();
    }

    public boolean yesNo(){
        String input = sc.next();
        System.out.println(input);
        if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max){
        int userInt = sc.nextInt();
        if(userInt >= min && userInt <= max){
            return userInt;
        }else{
            System.out.println("Enter a valid integer between " + min + "and"
                    + max);
            return getInt(min, max);
        }
    }

    public int getInt(){
        return sc.nextInt();
    }

    //    public int getInt(){
//    try{ String a = getString();
//        return Integer.valueOf(a);
//    }
//    catch(NumberFormatException e){
//        System.out.println("something went wrong" + e.getMessage());
//        System.out.println("Here is some more detail:");
//        e.printStackTrace();
//        return getInt();
//        }

//    }

    public double getDouble(double min, double max){
        double userInt = sc.nextDouble();
        if(userInt >= min && userInt <= max){
            return userInt;
        }else{
            System.out.println("Enter a valid double integer between " + min + "and"
                    + max);
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        return sc.nextDouble();
    }

    //public double getDouble(){
//    try{ String a = getString();
//        return Double.valueOf(a);
//    }
//    catch(NumberFormatException e){
//        System.out.println("something went wrong" + e.getMessage());
//        System.out.println("Here is some more detail:");
//        e.printStackTrace();
//        return getDouble();
//    }
//
//}
}
