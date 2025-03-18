package world;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import world.Organisms.Organism;

public class Action {

    public void add(List<Organism> organisms) {
        List<Organism> newOrganisms = new ArrayList<>();
        for (Organism o : organisms) {
            if (o.canReproduce()) {
                Organism offspring = o.reproduce();
                if (offspring != null) {
                    newOrganisms.add(offspring);
                    o.setPowerToReproduce(o.getPowerToReproduce() / 2);
                }
            }
        }
        organisms.addAll(newOrganisms);
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
        List<Organism> toRemove = new ArrayList<>();

        while (iterator.hasNext()) {
            Organism o1 = iterator.next();
            if (o1.getLifeLength() <= 0) {
                System.out.println("Removing " + o1.getClass().getSimpleName() + " (age expired)");
                iterator.remove(); // Safe removal
                continue;
            }
            for (Organism o2 : organisms) {
                if (!o1.equals(o2) && samePosition(o1, o2)) {
                    if (o1.getPower() > o2.getPower()) {
                        System.out.println("Removing " + o2.getClass().getSimpleName() + " (weaker in battle)");
                        toRemove.add(o2);
                    } else {
                        System.out.println("Removing " + o1.getClass().getSimpleName() + " (weaker in battle)");
                        iterator.remove();
                    }
                    break;
                }
            }
        }
        organisms.removeAll(toRemove);
    }

    public void increasePower(List<Organism> organisms) {
        organisms.forEach(o -> o.setPower(o.getPower() + 1));
    }

    private boolean samePosition(Organism o1, Organism o2) {
        return o1.getPosition().equals(o2.getPosition());
    }
}
