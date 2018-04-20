package thur.sortarrays;

/**
 *
 * @author john
 */
public class ThurSortArrays {
    
    public static int[] createArray(int length) {
        int[] result = new int[length];
        
        for (int i = 0; i < result.length; i++) {
            result[i] = (int)(Math.random() * length);
        }
        
        return result;
    }
    
    public static void printArray(int[] array) {
        System.out.print("[");
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        
        System.out.println("]");
    }
    
    public static int findIndexOfSmallest(int[] array, int startingIndex) {
        int smallest = array[startingIndex];
        int result = startingIndex;
        
        for (int i = startingIndex + 1; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                result = i;
            }
        }
        
        return result;
    }
    
    public static int[] cloneArray(int[] array) {
        int[] result = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        
        return result;
    }
    
    public static int[] sortArray(int[] array) {
        int[] result = cloneArray(array);
        
        for (int i = 0; i < result.length; i++) {
            int smallestIndex = findIndexOfSmallest(result, i);
            int tempValueToSwap = result[i];
            
            result[i] = result[smallestIndex];
            result[smallestIndex] = tempValueToSwap;
        }
        
        return result;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] myArray = createArray(1000000);
        
//        printArray(myArray);
        
        int[] sortedArray = sortArray(myArray);
        
//        printArray(sortedArray);
    }
    
}
