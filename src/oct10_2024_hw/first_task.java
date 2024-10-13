package oct10_2024_hw;

public class first_task {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        outputArr(arr);
        printLineArr(arr);
        printChartArr(arr);
    }


    /**
     * Выводит сам массив
     *
     * @param arr
     */

    static void outputArr(int[][] arr) {
        int n = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Выводит сумму строки
     *
     * @param arr
     */

    static void printLineArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            for (int n = 0; n < arr.length; n++) {
                j += arr[i][n];
            }
            System.out.println("Сумма строки " + i + " = " + j);
        }
    }

    /**
     * Выводит сумму столбца
     *
     * @param arr
     */
    
    static void printChartArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int n = 0;
            for (int j = 0; j < arr.length; j++) {
                n += arr[j][i];
            }
            System.out.println("Сумма столбца " + i + " = " + n);
        }
    }
}
