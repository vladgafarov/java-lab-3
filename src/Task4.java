public class Task4 {
    public static void main(String[] args) {
        int M = 4; // Количество строк
        int N = 5; // Количество столбцов

        int[][] matrix = generateMatrix(M, N);

        // Вывод матрицы
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int M, int N) {
        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; i++) {
            int value = 10 * (i + 1); // Значение для строки I
            for (int j = 0; j < N; j++) {
                matrix[i][j] = value;
            }
        }
        return matrix;
    }
}
