public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int K = 0;
        for(int i = array.length - 1; i >= 0; i--) {
            if(array[i] % 2 == 0) {
                K++;
                System.out.println(array[i]);
            }
        }
        System.out.println(K);
    }
}