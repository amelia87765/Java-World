package world;

import world.Organisms.*;

public class Main {
    public static void main(String[] args) {
        World javaWorld = new World(15, 15);

        javaWorld.addOrganism(new Grass(new Position(4, 2)));
        javaWorld.addOrganism(new Sheep(new Position(0, 1)));
        javaWorld.addOrganism(new Dandelion(new Position(4, 8)));
        javaWorld.addOrganism(new Wolf(new Position(6, 3)));
        javaWorld.addOrganism(new Toadstool(new Position(1, 6)));

        for (int i = 0; i < 30; i++) {
            javaWorld.makeTurn();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
