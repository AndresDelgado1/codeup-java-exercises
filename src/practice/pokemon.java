package practice;

public class pokemon {
    private String pokemonName;
    private int pokemonLevel;
    private String pokemonType;

    public pokemon(int pokemonLevel, String pokemonName, String pokemonType) {
        this.pokemonLevel = pokemonLevel;
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
    }

    public int getPokemonLevel() {
        return this.pokemonLevel;
    }

    public int setPokemonLevel(int newLevel) {
        return pokemonLevel = newLevel;
    }

    public String getPokemonName() {
        return this.pokemonName;
    }

    public void setPokemonName(String newName) {
        this.pokemonName = newName;
    }

    public String getPokemonType() {
        return this.pokemonType;
    }

    public void setPokemonType(String newType) {
        this.pokemonType = newType;
    }

    public void attack() {
        if (pokemonType.toLowerCase().equals("grass")) {
            System.out.println(pokemonName + " used razor leaf!");
        } if (pokemonType.toLowerCase().equals("fire")){
            System.out.println(pokemonName + " used flame thrower");
        } if (pokemonType.toLowerCase().equals("water")) {
            System.out.println(pokemonName + " used water gun");
        }
    }

        public void iChooseYou () {
            System.out.println("RAWRRRRRR!");
            System.out.println("Lvl." + pokemonLevel + " " + pokemonName);
        }


        public static void fizzBuzz(){
            for (int i = 0; i <= 100; i++){
                if ( i % 3 == 0 && i % 5 == 0){
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("buzz");
                }
            }

        }


        public static void main (String[]args){
            pokemon one = new pokemon(31, "bulbasaur", "grass");
            one.iChooseYou();
            one.attack();

            pokemon two = new pokemon(32, "squirtle", "Water");
            two.iChooseYou();
            two.attack();

            fizzBuzz();
//            for (int i = 0; i <= 100; i++){
//                if ( i % 3 == 0 && i % 5 == 0){
//                    System.out.println("FizzBuzz");
//                } else if (i % 3 == 0) {
//                    System.out.println("Fizz");
//                } else if (i % 5 == 0) {
//                    System.out.println("buzz");
//                } else {
//                    System.out.println(i);
//                }
//            }



        }
}