package flowers.domain.florets;

import java.util.Comparator;

public class FlowersComparator implements Comparator<Flowers> {

    @Override
    public int compare(Flowers f1, Flowers f2) {
        return f1.getFreshness().getFreshLevel() - f2.getFreshness().getFreshLevel();
    }
}
