package Moves.SecondaryEffect;
import pokemon.pokemon;
public class burn implements SecondaryEffect {

    @Override
    public void apply(pokemon user, pokemon target){
        if(Math.random() * 100 < getChance() && target.Status.equals){

        }
    }
    @Override
    public int getChance(){
        return 10;
    }
}
