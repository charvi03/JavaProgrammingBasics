import java.util.Arrays;

public class sort_array {
    public static void main(String[] args) {
        int[] my_array1 = {1, 6, 3, 2, 9, 8};

        String[] my_array2 = {"Java", "Python", "PHP", "C Programming", "R Programming"
        };
        System.out.println("Original numeric array : " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array : " + Arrays.toString(my_array1));

        System.out.println("Original string array : " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array : " + Arrays.toString(my_array2));
    }
}
