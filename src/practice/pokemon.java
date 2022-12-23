package practice;

public class pokemon {
    private String pokemonName;
    private int pokemonLevel;
    private String pokemonType;

    public pokemon(int pokemonLevel, String pokemonName, String pokemonType ){
        this.pokemonLevel = pokemonLevel;
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
    }

    public int getPokemonLevel(){
        return this.pokemonLevel;
    }
    public int setPokemonLevel(int newLevel){
        return pokemonLevel = newLevel;
    }
    public String getPokemonName(){
        return this.pokemonName;
    }
    public String setPokemonName(String newName){
        return pokemonName = newName;
    }
    public String getPokemonType(){
        return this.pokemonType;
    }
    public String setPokemonType(String newType){
        return pokemonName = newType;
    }
    public void attack(){
        System.out.println(pokemonName + " attacked!");
    }
    public void iChooseYou(){
        System.out.println("RAWRRRRRR!");
        System.out.println(pokemonLevel + " " + pokemonName);
    }


    public static void main(String[] args) {
        pokemon one = new pokemon(31, "bulbasaur", "grass");
        one.iChooseYou();
        one.attack();
    }
}
