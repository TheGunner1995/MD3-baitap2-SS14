import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {2, 3, 5, 6, 73, 2, 4};
        selectSort(list);
        System.out.println("sắp xếp chọn");
        System.out.println(Arrays.toString(list));
        insertionSort(list);
        System.out.println("sắp xếp chèn");
        System.out.println(Arrays.toString(list));
    }

    public static void selectSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int min = list[i];
            int minIndex = i;
            for (int j = i+1; j < list.length; j++) {
                if (min > list[j]) {
                    min = list[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }

    }
    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++){
            int currentElement = list[i];
            int k;
            for(k = i - 1; k >=0 && list[k] > currentElement; k--){
                list[k+1] = list[k];
            }
            list[k+1] = currentElement;
        }
    }
}