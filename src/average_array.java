public class average_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        double sum = 0;
        //Loop through the array to calculate sum of elements
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double avg=sum/2;
        System.out.println("Average of all the elements of an array: " + avg);
    }
}
