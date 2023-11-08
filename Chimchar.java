package mypokemons;

import laba2.lab2;
import mymoves.chimchar.Fire_Blast;
import mymoves.chimchar.Flamethrower;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Chimchar extends Pokemon{
    public Chimchar(String name, int level){
        super(name, level);

        super.setType(Type.FIRE);
        super.setStats(44, 58, 44, 58, 44, 61);


        Fire_Blast fireBlast = new Fire_Blast(110, 85);
        Flamethrower flamethrower = new Flamethrower(90, 100);
        super.setMove(fireBlast, flamethrower);

    }

}
