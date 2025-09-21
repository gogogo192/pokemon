package Moves;
import pokemon.PokeType;
import pokemon.pokemon;

public class flameThrower implements Move{

    @Override
    public String getName() {
        return "화염방사";
    }
    @Override
    public PokeType getType(){
        return PokeType.FIRE;
    }

    @Override
    public int getPower(){
        return 90;
    }

    @Override
    public int getAccuracy(){
        return 100;
    }

    @Override
    public boolean isStatusMove(){
        return false;
    }

    @Override
    public boolean isFixedDamage(){
        return false;
    }

    @Override
    public boolean attempt(pokemon user, pokemon target){
        return Math.random() * 100 < getAccuracy();
    }

    @Override
    public void use(pokemon user, pokemon target){
        System.out.println(user.getName() + "의" +this.getName() +"!!");
        effect.apply(user,target);
    }
}
