package mypokemons;

import laba2.lab2;
import mymoves.numel.Fire_Blast;
import mymoves.numel.Magnitude;
import mymoves.numel.Tackle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Numel extends Camerupt{
    public Numel(String name, int level){
        super(name, level);

        super.setType(Type.FIRE, Type.GROUND);
        super.setStats(60, 60, 40, 65, 45, 35);


        Fire_Blast fireBlast = new Fire_Blast(110, 85);
        Tackle tackle = new Tackle(40, 100);
        Magnitude magnitude = new Magnitude(70, 100);

        super.setMove(magnitude, fireBlast, tackle);

    }

}
