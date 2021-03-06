package lesson18.task2;

import java.util.Comparator;

public class ComparatorOfName implements Comparator<Product> {
    @Override
    public int compare(Product first, Product second) {
        return second.getName().compareTo(first.getName());
    }
}
