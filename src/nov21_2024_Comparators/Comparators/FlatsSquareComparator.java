package nov21_2024_Comparators.Comparators;

import java.util.Comparator;

public class FlatsSquareComparator implements Comparator<Flats> {
    @Override
    public int compare(Flats o1, Flats o2) {
        if (Integer.compare(o1.getSquare(), o2.getSquare()) == 0) {
            return o1.getFlat().compareTo(o2.getFlat());
        }
        return Integer.compare(o1.getSquare(), o2.getSquare());
    }
}
