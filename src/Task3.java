public class Task3 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {6, 7, 8, 9, 10};

        swapArrays(A, B);

        System.out.print("Array A after swap: ");
        for (int element : A) {
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.print("Array B after swap: ");
        for (int element : B) {
            System.out.print(element + " ");
        }
    }

    public static void swapArrays(int[] A, int[] B) {
        if (A.length != B.length) {
            throw new IllegalArgumentException("Arrays must be of the same length");
        }

        for (int i = 0; i < A.length; i++) {
            int temp = A[i];
            A[i] = B[i];
            B[i] = temp;
        }
    }
}
