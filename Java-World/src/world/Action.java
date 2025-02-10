package world;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import world.Organisms.Organism;

public class Action {

    public void add(List<Organism> organisms) {
        for (Organism o : organisms) {
            if (o.canReproduce()) {
                Organism offspring = o.reproduce();
                if (offspring != null) {
                    organisms.add(offspring);
                    o.setPowerToReproduce(o.getPowerToReproduce() / 2);
                }
            }
        }
    }

    public void makeMove(List<Organism> organisms) {
        Random random = new Random();
        for (Organism o : organisms) {
            if (o.canMove()) {
                o.move(random.nextInt(6));
            }
        }
    }

    public void remove(List<Organism> organisms) {
        Iterator<Organism> iterator = organisms.iterator();
        while (iterator.hasNext()) {
            Organism o1 = iterator.next();
            for (Organism o2 : organisms) {
                if (!o1.equals(o2) && samePosition(o1, o2)) {
                    if (o1.getPower() > o2.getPower()) {
                        iterator.remove();
                    } else {
                        organisms.remove(o2);
                    }
                    break;
                }
            }
        }
    }

    public void increasePower(List<Organism> organisms) {
        organisms.forEach(o -> o.setPower(o.getPower() + 1));
    }

    private boolean samePosition(Organism o1, Organism o2) {
        return o1.getPosition().equals(o2.getPosition());
    }
}
