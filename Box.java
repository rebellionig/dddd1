package student.java.homework.weeks.week3_6_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public double getWeight() {
        double weight = 0;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> other) {
        return this.getWeight() == other.getWeight();
    }

    public void transferFruitsTo(Box<T> other) {
        other.fruits.addAll(fruits);
        fruits.clear();
    }

    public void sortFruits() {
        Collections.sort(fruits, new Comparator<Fruit>() {
            @Override
            public int compare(Fruit f1, Fruit f2) {
                return Double.compare(f1.getWeight(), f2.getWeight());
            }
        });
    }
}
