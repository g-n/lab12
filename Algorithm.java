import java.util.Random;

public abstract class Algorithm  < T extends Comparable < ? super T > >{

    static Random r = new Random();

    public abstract void apply(T[] array);

    public long  time(T[] array) {
        long start, end;
        start = System.currentTimeMillis();

        // invoke the apply method
        this.apply(array);

        end = System.currentTimeMillis();

        // returns elapsed time
        return  (end - start);
    }

    /**
     * Create an array containing n random Integers.
     */
    public static Integer[] createRandomArray(int n){
        Integer[] arr = new Integer[n];
        for(int i=0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }

        return arr;
    }

    public static void main(String args[]){
        for (Integer i:createRandomArray(30)) {
            System.out.println(i);
        }
    }

}