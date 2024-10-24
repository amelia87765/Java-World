package world.Organisms;

import world.Position;

public class Dandelion extends Plant {

    public Dandelion(Position pos) {
        super(pos);
    }

    public void defineParameters() {
        this.power = 0;
        this.initiative = 0;
        this.lifeLength = 6;
        this.powerToReproduce = 2;
        this.sign = 'D';
    }
}