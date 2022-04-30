/*
 * Benchmarks 4 sorting algorithms:
 *      SelectionSort
 *      InsertionSort
 *      MergeSort
 *      QuickSort
 * for integer arrays of size:
 *      n=25000
 *      n=50000
 *      n=75000
 *      n=100000
 */

public class TimeSorts {
    public static void main(String args[]){
        System.out.println("N=25000");
        SortingAlgorithm.compareSorts(25000);
        System.out.println("\nN=50000");
        SortingAlgorithm.compareSorts(50000);
        System.out.println("\nN=75000");
        SortingAlgorithm.compareSorts(75000);
        System.out.println("\nN=100000");
        SortingAlgorithm.compareSorts(100000);
    }
}
