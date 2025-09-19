import pokemon.pokemon;

import java.util.EnumSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        pokemon 리자몽 = new pokemon("에이스","용감",78,84,78,109,85,100,0,0,0,252,0,252
        ,31,31,31,31,31,31, EnumSet.of(PokeType.FLYING, PokeType.FIRE));

        System.out.println(리자몽.RealAtt());
    }

}