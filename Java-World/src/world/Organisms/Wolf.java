package world.Organisms;

import world.Position;

public class Wolf extends Animal {

    public Wolf(Position pos) {
        super(pos);
    }

    public void defineParameters() {
        this.power = 8;
        this.initiative = 5;
        this.lifeLength = 20;
        this.powerToReproduce = 16;
        this.sign = 'W';
    }
}
