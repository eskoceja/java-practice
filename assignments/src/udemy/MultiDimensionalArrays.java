package udemy;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int[] values = {3, 4, 5, 123};
//        System.out.println(values[2]);

        int[][] grid = {
                {3, 4, 5, 123},
                {2, 4, 6},
                {1, 2, 3, 4}
        };

        System.out.println(grid[1][1]);
        System.out.println(grid[0][2]);

        String[][] texts = new String[2][3];
        System.out.println(texts[0][1]);
        texts[0][1] = "Hello there";
        System.out.println(texts[0][1]);

        for(int row = 0; row< grid.length; row++) {
            for(int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println("");
        }

        String[][] words = new String[2][];
        words[0] = new String[3];
        words[0][1] = "hi there";
        System.out.println(words[0][1]);

    }
}
