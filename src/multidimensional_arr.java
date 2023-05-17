public class multidimensional_arr {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]);
//                System.out.println(numbers.length);
//                System.out.println(numbers[i].length);
            }
//            System.out.println(numbers.length);
//            System.out.println("no of cols in 1st row " + numbers[0].length);
//            System.out.println("no of cols in 2nd row " + numbers[1].length);
            System.out.println();
        }
        System.out.println("total no.of rows " + numbers.length);
    }
}
