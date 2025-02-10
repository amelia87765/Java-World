package world;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import world.Organisms.Organism;

public class SortByPower implements Comparator<Organism> {

    static SortByPower sort = new SortByPower();

    public static void sort(List<Organism> toSort) {
        Collections.sort(toSort, sort);
    }

    @Override
    public int compare(Organism o1, Organism o2) {
        return Double.compare(o1.getPower(), o2.getPower());
    }
}
