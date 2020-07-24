package domain.florets;

import java.util.Comparator;

public class FlowersComparator implements Comparator<Flower> {

    @Override
    public int compare(Flower f1, Flower f2) {
        return f1.getFreshness().getFreshLevel() - f2.getFreshness().getFreshLevel();
    }
}
