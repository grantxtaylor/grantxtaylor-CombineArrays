public class CombineArrays {
    public int[] combine(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        for (int element : arr1) {
            result[i] = element;
            i++;
        }
        for (int element : arr2) {
            result[i] = element;
            i++;
        }
        return result;
    }
}

