package mymoves.camerupt;

import laba2.lab2;
import ru.ifmo.se.pokemon.*;

public class Fire_Blast extends SpecialMove {
    public Fire_Blast(double pow, double acc) {
        super(Type.FIRE, pow, acc);


    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if (lab2.chance(0.1)) {
            Effect.burn(p);
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length - 1];

    }
}
