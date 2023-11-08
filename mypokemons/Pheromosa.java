package mypokemons;

import mymoves.pheromosa.Bulk_up;
import mymoves.pheromosa.Confide;
import mymoves.pheromosa.Focus_Energy;
import mymoves.pheromosa.Rock_Tomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pheromosa extends Pokemon{
    public Pheromosa(String name, int level){
        super(name, level);

        super.setType(Type.FIGHTING, Type.GHOST);
        super.setStats(71, 137, 37, 137, 37, 151);

        Confide confide = new Confide(0, 0);
        Bulk_up bulkUp = new Bulk_up(0, 0);
        Rock_Tomb rockTomb = new Rock_Tomb(60, 95);
        Focus_Energy focusEnergy = new Focus_Energy(0, 0);

        super.setMove(confide, bulkUp, rockTomb, focusEnergy);
    }
}
