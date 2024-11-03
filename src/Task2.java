public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
            if (i != 0 && array[i] - array[i-1] != 1) {
                System.out.println(array[i]);
                break;
            }
            if(i == array.length - 1) {
                System.out.println(0);
            }
        }
    }
}
