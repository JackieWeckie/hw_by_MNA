package nov21_2024_Comparators.Comparators;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Flats implements Comparable<Flats> {
    private String flat;
    private int square;

    public static void main(String[] args) {
        Map<String, Integer> flats = new TreeMap<>();
        flats.put(String.valueOf(new Flats("Flat #1", 59)), 1);
        flats.put(String.valueOf(new Flats("Flat #2", 82)), 2);
        flats.put(String.valueOf(new Flats("Flat #3", 67)), 3);

        System.out.println("The main map: " + flats);

        TreeMap<Flats, Object> flatInfo = new TreeMap<>(new FlatComparator());
        flatInfo.put(new Flats("Flat #1", 59), 1);
        flatInfo.put(new Flats("Flat #2", 82), 2);
        flatInfo.put(new Flats("Flat #3", 67), 3);

        System.out.println("Flat map sorted by name: " + flatInfo);

        TreeMap<Flats, Object> flatSquare = new TreeMap<>(new FlatsSquareComparator());
        flatSquare.put(new Flats("Flat #1", 59), 1);
        flatSquare.put(new Flats("Flat #2", 82), 2);
        flatSquare.put(new Flats("Flat #3", 67), 3);

        System.out.println("Flat map sorted by square (m2): " + flatSquare);
    }

    public Flats(String flat, int square) {
        this.flat = flat;
        this.square = square;
    }

    @Override
    public String toString() {
        return "The flat that named " + flat + " with " + square + " (m2) square" + "\n";
    }

    public String getFlat() {
        return flat;
    }

    public int getSquare() {
        return square;
    }

    @Override
    public int compareTo(Flats o) {
        return Comparator.comparing(Flats::getFlat)
                .thenComparing(Flats::getSquare)
                .compare(this, o);
    }
}
