package sort;

public class Duck implements Comparable {
    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return this.name + ", weight: " + this.weight;
    }

    public int compareTo(Object obj) {
        Duck other = (Duck) obj;

        if (this.weight < other.weight) {
            return -1;
        } else if (this.weight == other.weight) {
            return 0;
        } else {
            return 1;
        }
    }
}