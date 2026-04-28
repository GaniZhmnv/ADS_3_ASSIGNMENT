import java.util.Arrays;

public class Experiment {
    private final Sorter sorter;
    private final Searcher searcher;

    public Experiment(Sorter sorter, Searcher searcher) {
        this.sorter = sorter;
        this.searcher = searcher;
    }

    public long measureSortTime(int[] arr, String type) {
        int[] copy = Arrays.copyOf(arr, arr.length);

        long start = System.nanoTime();

        if (type.equalsIgnoreCase("basic")) {
            sorter.basicSort(copy);
        } else if (type.equalsIgnoreCase("advanced")) {
            sorter.advancedSort(copy);
        }

        long end = System.nanoTime();

        return end - start;
    }

    public long measureSearchTime(int[] arr, int target) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        sorter.advancedSort(copy);

        long start = System.nanoTime();
        searcher.search(copy, target);
        long end = System.nanoTime();

        return end - start;
    }

    public void runAllExperiments() {
        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {
            int[] random = sorter.generateRandomArray(size);
            int[] sorted = sorter.generateSortedArray(size);

            int target = sorted[size / 2];

            long basicRandom = measureSortTime(random, "basic");
            long advancedRandom = measureSortTime(random, "advanced");

            long basicSorted = measureSortTime(sorted, "basic");
            long advancedSorted = measureSortTime(sorted, "advanced");

            long searchTime = measureSearchTime(sorted, target);

            System.out.println("Size: " + size);
            System.out.println("Random Bubble: " + basicRandom);
            System.out.println("Random Quick: " + advancedRandom);
            System.out.println("Sorted Bubble: " + basicSorted);
            System.out.println("Sorted Quick: " + advancedSorted);
            System.out.println("Binary Search: " + searchTime);
            System.out.println();
        }
    }
}