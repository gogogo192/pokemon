package Moves;

import pokemon.PokeType;
import pokemon.pokemon;
public interface Move {
    String getName();
    PokeType getType();
    int getPower();
    int getAccuracy();
    boolean isStatusMove();
    boolean isFixedDamage();
    boolean attempt(pokemon user, pokemon target);
    void use(pokemon user, pokemon target);
}
