package world.Organisms;

import world.Position;

public class Dandelion extends Plant {

    public Dandelion(Position pos) {
        super(pos);
        defineParameters();
    }

    public void defineParameters() {
        this.power = 0;
        this.initiative = 0;
        this.lifeLength = 6;
        this.powerToReproduce = 2;
        this.sign = 'D';
    }

    @Override
    public Dandelion reproduce() {
        return new Dandelion(new Position(this.position.getX(), (this.position.getY() + 1) % 10));
    }
}