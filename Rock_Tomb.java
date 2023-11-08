package mymoves.pheromosa;

import ru.ifmo.se.pokemon.*;


public class Rock_Tomb extends PhysicalMove {
    public Rock_Tomb(double pow, double acc){
        super(Type.ROCK, pow, acc);


    }
    @Override
    protected void	applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect e = new Effect().stat(Stat.SPEED, -1 );
        p.addEffect(e);

    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];

    }
}
