import java.util.*;
public class ServerNameGenerator {
    public static void main(String[] args){
        String[] adjectives = {"adorable",	"adventurous",	"aggressive",
                "awful",	"bad",	"beautiful",
                "better",	"bewildered",	"black",
                "bloody"};
        String[] nouns = {"whale", "tiger", "finger", "pencil", "sand", "mouse", "apple", "salt", "ball", "frog"};

        Random name = new Random();
        int n = name.nextInt(10);
        System.out.println("Your username is: " + adjectives[n] + "-" + nouns[n]);

//        int randomElement = nouns[Math.random()*nouns.length];
    }
}
