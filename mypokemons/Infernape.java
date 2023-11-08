package mypokemons;

import mymoves.infernape.Close_Combat;
import mymoves.infernape.Fire_Blast;
import mymoves.infernape.Flamethrower;
import mymoves.infernape.Slack_off;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Infernape extends Pokemon{
    public Infernape(String name, int level){
        super(name, level);

        super.setType(Type.FIRE, Type.FIGHTING);
        super.setStats(76, 104, 71, 104, 71, 108);

        Close_Combat close_combat = new Close_Combat(120, 100);
        Flamethrower flamethrower = new Flamethrower(90, 100);
        Fire_Blast fireBlast = new Fire_Blast(110, 85);
        Slack_off slackOff = new Slack_off(0, 0);


        super.setMove(close_combat, flamethrower, fireBlast, slackOff);

    }

}
