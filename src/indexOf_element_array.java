public class indexOf_element_array {
    public static int search(int[] num, int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 12;
        int index = search(numbers, key);
        if (index == -1) {
            System.out.println(" Element not found");
        } else {
            System.out.println("Element is at index " + index);
        }
    }
}

