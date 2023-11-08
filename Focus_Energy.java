package mymoves.pheromosa;

import ru.ifmo.se.pokemon.*;

public class Focus_Energy extends StatusMove {
    public Focus_Energy(double pow, double acc){
        super(Type.NORMAL, pow, acc);


    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];

    }
}
