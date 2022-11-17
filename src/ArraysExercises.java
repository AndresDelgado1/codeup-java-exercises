import java.util.Arrays;
public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

//        String[] persons = {"Andres", "Ethan", "Rajib"};24GJ2X
//        for(String person : persons){
//            System.out.println(person);
//        }



        Person[] friends = new Person[3];
        friends[0] = new Person("Andres");
        friends[1] = new Person("Ethan");
        friends[2] = new Person("Rajib");
        Person John = new Person("John");
        for(int i = 0; i < friends.length; i++){
//            System.out.println(friends[i].getName());
        }

    }
    public static Person[] addPerson(Person[] x, Person name){

        Person[] newArray = Arrays.copyOf(x , 4);
        newArray[3] = name;
        return newArray;

    }

}
