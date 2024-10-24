package world.Organisms;

import world.Position;

public class Toadstool extends Plant {

    public Toadstool(Position pos) {
        super(pos);
    }

    public void defineParameters() {
        this.power = 0;
        this.initiative = 0;
        this.lifeLength = 12;
        this.powerToReproduce = 4;
        this.sign = 'T';
    }
}
