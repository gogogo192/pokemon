package Moves.SecondaryEffect;
import pokemon.pokemon;
public interface SecondaryEffect {
    void apply(pokemon user, pokemon target);
    int getChance();
}
