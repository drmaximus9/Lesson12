import java.util.Arrays;

public class HomeWorkThree {
    public static void main(String[] args) {
        arrayDataOne();
        arrayDataTwo();
        arrayDataThree();
        arrayDataFour();
        getArray(5, 5);
    }

    private static void arrayDataOne(){
        int[] data = { 1, 1, 0, 1, 0};
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 0) {
                data[i] = 1;
            } else {
                data[i] = 0;
            }

        }
        System.out.println(Arrays.toString(data));
    }

    private static void arrayDataTwo() {

        int[] data = new int[100];
        int counter = 1;

        for (int i = 0; i < data.length; i++) {
            data[i] = counter;
            System.out.printf("%2d ", data[i]);
            counter++;
        }
        System.out.println();
    }

    private static void arrayDataThree(){
        int[] data = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < data.length; i++) {
            if (data[i] < 6) {
                data[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(data));
    }

    private static void arrayDataFour(){
        int[][] deepData = new int[5][5];
//        int n = 1;

        for (int i = 0; i < deepData.length; i++) {
            for (int j = 0; j < deepData[i].length; j++) {
//                deepData[i][j] = n++;
                if (deepData[i] == deepData[j]) {
                    deepData[i][j] = 1;
                }

                System.out.printf("%2d ", deepData[i][j]);
            }

            System.out.println();
        }
    }

    public static int[] getArray(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + initialValue + " ");
        }
        return arr;

    }
}
