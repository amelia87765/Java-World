package world.Organisms;

import world.Position;

public class Organism {
    int power;
    int initiative;
    Position position;
    int lifeLength;
    int powerToReproduce;
    char sign;

    public void setPower(int pow) {
        this.power = pow;
    }

    public int getPower() {
        return this.power;
    }

    public void setInitiative(int init) {
        this.initiative = init;
    }

    public int getInitiative() {
        return this.initiative;
    }

    public void setPosition(Position pos) {
        this.position = pos;
    }

    public Position getPosition() {
        return this.position;
    }

    public void setLifeLength(int lif) {
        this.lifeLength = lif;
    }

    public int getLifeLength() {
        return this.lifeLength;
    }

    public void setPowerToReproduce(int powR) {
        this.powerToReproduce = powR;
    }

    public int getPowerToReproduce() {
        return this.powerToReproduce;
    }

    public void setSign(char sig) {
        this.sign = sig;
    }

    public char getSign() {
        return this.sign;
    }

    public boolean canReproduce() {
        if (this.power >= this.powerToReproduce) {
            return true;
        }
        return false;
    }

    /*
     * public Organism reproduce() {
     * Organism o = new Organism();
     * return o;
     * }
     */
}
