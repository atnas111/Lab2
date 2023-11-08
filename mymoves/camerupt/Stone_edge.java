package mymoves.camerupt;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Stone_edge extends PhysicalMove {
    public Stone_edge ( double pow, double acc){
        super(Type.ROCK, pow, acc);


    }
    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        super.calcCriticalHit(att, def);
        return 0.125;
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];

    }
}
