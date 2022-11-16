public class Person {

    public static void main(String[] args){
        Person a = new Person();
    }

    private String name;

    public Person(){

    }

    public Person(String name){

    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
