package mypokemons;

import mymoves.camerupt.Fire_Blast;
import mymoves.camerupt.Magnitude;
import mymoves.camerupt.Stone_edge;
import mymoves.camerupt.Tackle;
import mymoves.infernape.Close_Combat;
import mymoves.infernape.Flamethrower;
import mymoves.infernape.Slack_off;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Camerupt extends Pokemon {
    public Camerupt(String name, int level){
        super(name, level);

        super.setType(Type.FIRE, Type.GROUND);
        super.setStats(70, 100, 70, 105, 75, 40);

        Stone_edge stoneEdge = new Stone_edge(100, 80);
        Fire_Blast fireBlast = new Fire_Blast(110, 85);
        Tackle tackle = new Tackle(40, 100);
        Magnitude magnitude = new Magnitude(70, 100);

        super.setMove(stoneEdge, fireBlast, tackle, magnitude);


    }
}
