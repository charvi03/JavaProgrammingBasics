import java.util.Arrays;

public class copy_elements_arr {
    public static int[] copyElements(int[] arr) {

        int[] anotherArray = new int[arr.length];

        for (int i = 0, k = 0; i < arr.length; i++) {

            anotherArray[k++] = arr[i];
        }

        return anotherArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original Array: "
                + Arrays.toString(arr));

        arr = copyElements(arr);

        System.out.println("Resultant Copied Array: "
                + Arrays.toString(arr));
    }
}
