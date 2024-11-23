package nov21_2024_Comparators.Comparators;

import java.util.Comparator;

public class FlatComparator implements Comparator<Flats> {
    @Override
    public int compare(Flats o1, Flats o2) {
        if (o1.getFlat().compareTo(o2.getFlat()) == 0) {
            return Integer.compare(o1.getSquare(), o2.getSquare());
        }
        return o1.getFlat().compareTo(o2.getFlat());
    }
}
