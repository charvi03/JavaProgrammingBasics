public class contains_element_array {
    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] my_array1 = {
                9, 15, 3, 6, 1, 10, 17};
        System.out.println(contains(my_array1, 10));
        System.out.println(contains(my_array1, 20));
    }
}

