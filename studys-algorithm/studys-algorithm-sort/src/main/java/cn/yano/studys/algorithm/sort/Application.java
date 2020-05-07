package cn.yano.studys.algorithm.sort;

import cn.yano.studys.algorithm.sort.service.SortService;

import java.util.Arrays;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        int arraySize = 40000;
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(arraySize * 10);
        }
//        Arrays.sort(array);
        System.out.println("init result " + Arrays.toString(array));
        int[] array1 = Arrays.copyOf(array, array.length);
        long t1 = System.currentTimeMillis();
        int[] result = SortService.bubbleSort(array1);
        long t2 = System.currentTimeMillis();
        System.out.println("bubbleSort result " + Arrays.toString(result));
        System.out.println("bubbleSort cost " + (t2 - t1) + "ms");

        int[] array2 = Arrays.copyOf(array, array.length);
        long t3 = System.currentTimeMillis();
        result = SortService.selectionSort(array2);
        long t4 = System.currentTimeMillis();
        System.out.println("selectionSort result " + Arrays.toString(result));
        System.out.println("selectionSort cost " + (t4 - t3) + "ms");

        int[] array3 = Arrays.copyOf(array, array.length);
        long t5 = System.currentTimeMillis();
        result = SortService.insertionSort(array3);
        long t6 = System.currentTimeMillis();
        System.out.println("insertionSort result " + Arrays.toString(result));
        System.out.println("insertionSort cost " + (t6 - t5) + "ms");

        int[] array4 = Arrays.copyOf(array, array.length);
        long t7 = System.currentTimeMillis();
        result = SortService.shellSort(array4);
        long t8 = System.currentTimeMillis();
        System.out.println("shellSort result " + Arrays.toString(result));
        System.out.println("shellSort cost " + (t8 - t7) + "ms");

    }
}
