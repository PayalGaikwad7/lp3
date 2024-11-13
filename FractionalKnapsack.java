
import java.util.Arrays;

class Item {

    int weight;
    int value;
    double ratio;

    Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
        this.ratio = value / (double) weight;
    }
}

class FractionalKnapsack {

    static double getMaxValue(Item[] items, int capacity) {
        // Sort items by value-to-weight ratio in descending order
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        double totalValue = 0;
        for (Item item : items) {
            if (capacity > 0 && item.weight <= capacity) {
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                totalValue += item.ratio * capacity;
                break;
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {
        Item[] items = {new Item(10, 60), new Item(20, 100), new Item(30, 120)};
        int capacity = 50;
        System.out.println("Maximum value in Knapsack: " + getMaxValue(items, capacity));
    }
}
