/*
 * Abstract class to implement a sorting algorithm
 */

public abstract class SortingAlgorithm <T extends Comparable <? super T>> extends Algorithm <T> {
    public abstract void sort (T[] array);
    /**
     * Invoke the appropriate sorting algorithm.
     */
    public void apply(T[] array) {
        this.sort(array);
    }

    public static <T extends Comparable<? super T>> boolean isSorted(Comparable[] array){

        for (int i = 1; i < array.length; i++)
            if( array[i-1].compareTo(array[i])> 0)
                return false;
        return true;
    }

    /** Task: Swaps the array elements a[i] and a[j].
     *  @param a  an array of objects
     *  @param i  an integer >= 0 and < a.length
     *  @param j  an integer >= 0 and < a.length */
    static void swap(Object[] a, int i, int j)
    {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static final int NUMBER = 4;
    public static void compareSorts(int n){
        SortingAlgorithm[] sorts = new SortingAlgorithm[NUMBER];

        sorts[0] = new SelectionSort();
        sorts[1] = new InsertionSort();
        sorts[2] = new MergeSort();
        sorts[3] = new QuickSort();

        String[] names = new String[] {
                "Selection Sort ",
                "Insertion Sort ",
                "Merge Sort     ",
                "Quick Sort     ",
        };


        Integer[][] sortArray = new Integer[NUMBER][n];
        sortArray[0] = createRandomArray(n);

        System.arraycopy(sortArray[0], 0, sortArray[1], 0, sortArray[0].length);
        System.arraycopy(sortArray[0], 0, sortArray[2], 0, sortArray[0].length);
        System.arraycopy(sortArray[0], 0, sortArray[3], 0, sortArray[0].length);


        for (int i=0; i < sorts.length; i++) {
            System.out.printf("%s (ms): %s\n", names[i], sorts[i].time(sortArray[i]));
        }

    }
}
