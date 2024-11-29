package world;

import world.Organisms.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Action {

    public void add(List<Organism> organisms) {
        for (Organism o : organisms) {
            if (o.canReproduce()) {
                Organism offspring = o.reproduce();
                organisms.add(offspring);
            }
        }
    }

    public void makeMove(List<Organism> organisms) {
        Random number = new Random();
        int random;
    }

    public void remove(List<Organism> organisms) {
        int size = organisms.size();
        for (int i = 0; i < size; i++) {
            Organism o1 = organisms.get(i);
            for (int j = i + 1; j < size; j++) {
                Organism o2 = organisms.get(j);
                if (samePosition(o1, o2)) {
                    if (o1.getPower() > o2.getPower()) {
                        organisms.remove(o2);
                    } else {
                        organisms.remove(o1);
                    }
                }
            }
        }
    }

    public boolean samePosition(Organism o1, Organism o2) {
        if ((o1.getPosition().x == o2.getPosition().x) && (o1.getPosition().y == o2.getPosition().y))
            return true;
        return false;
    }

    public void increasePower(List<Organism> organisms) {
        for (Organism o : organisms) {
            o.setPower(o.getPower() + 1);
        }
    }
}
