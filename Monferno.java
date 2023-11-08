package mypokemons;

import laba2.lab2;
import mymoves.monferno.Fire_Blast;
import mymoves.monferno.Flamethrower;
import mymoves.monferno.Slack_off;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Monferno extends Pokemon{
    public Monferno(String name, int level){
        super(name, level);

        super.setType(Type.FIRE, Type.FIGHTING);
        super.setStats(64, 78, 52, 78, 52, 81);


        Fire_Blast fireBlast = new Fire_Blast(110, 85);
        Slack_off slackOff = new Slack_off(0, 0);
        Flamethrower flamethrower = new Flamethrower(90, 100);

        super.setMove(slackOff, fireBlast, flamethrower);

    }

}
