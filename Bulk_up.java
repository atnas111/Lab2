package mymoves.pheromosa;

import ru.ifmo.se.pokemon.*;

public class Bulk_up extends StatusMove  {
    public Bulk_up(double pow, double acc){
        super(Type.FIGHTING, pow, acc);


    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.DEFENSE, 1 );
        Effect e1 = new Effect().stat(Stat.ATTACK, 1 );

        p.addEffect(e);
        p.addEffect(e1);

    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];

    }
}
