package 算法基础班.day01;

/**
 * @author lch
 * @create 2021-09-12 下午 12:15
 * 1,选择排序
 * 2,冒泡排序
 * 3,插入排序
 */
public class 排序 {
    public static void main(String[] args) {
        int[] arr = {9, 5, 5, 6, 3, 8, 3, 6};
        print(arr);
        // selectSort(arr);
        // bubbleSort(arr);
        insertSort(arr);
        print(arr);
    }

    public static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    change(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    public static void bubbleSort(int[] arr) {
        int N = arr.length;
        for (int i = N-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    change(arr, j, j + 1);
                }
            }
        }
    }


    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int inex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[inex] > arr[j]) {
                    inex = j;
                }
            }
            change(arr, i, inex);
        }
    }

    public static void change(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
