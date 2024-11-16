package student.java.homework.weeks.week3_6_1;

public class Main {
    public static void main(String[] args) {
        // Create boxes for apples and oranges
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        // Add fruits to the boxes
        appleBox.addFruit(new Apple(1.2));
        appleBox.addFruit(new Apple(1.5));
        orangeBox.addFruit(new Orange(1.3));
        orangeBox.addFruit(new Orange(1.4));

        // Print the weight of each box
        System.out.println("Apple Box Weight: " + appleBox.getWeight());
        System.out.println("Orange Box Weight: " + orangeBox.getWeight());

        // Compare the two boxes
        System.out.println("Boxes have equal weight: " + appleBox.compare(orangeBox));

        // Transfer fruits from one box to another
        Box<Apple> anotherAppleBox = new Box<>();
        appleBox.transferFruitsTo(anotherAppleBox);
        System.out.println("Apple Box Weight after transfer: " + appleBox.getWeight());
        System.out.println("Another Apple Box Weight: " + anotherAppleBox.getWeight());

        // Sort fruits in the box
        anotherAppleBox.sortFruits();
    }
}
