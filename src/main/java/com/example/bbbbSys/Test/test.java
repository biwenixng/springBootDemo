package com.example.bbbbSys.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;

public class test {

    public static void main(String[] args) throws UnknownHostException {

//        String a = new String("aa");
//        String b = new String("aa");
//        LinkedList<Integer> objects = new LinkedList<>();
//        objects.add(1);
//        objects.add(2);
//        objects.add(3);
//        Iterator<Integer> iterator = objects.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
////        }
//        List linkedList = new LinkedList();
//        Set<Integer> set = new HashSet<>();
//        Map hashMap = new TreeMap();

        int[] arrays = randomArrays(2, 50);
        int[] arrays1 = arrays.clone();
        //选择排序
//        for (int i = 0; i < num.length; i++) {
//            int minIndex = i;
//            for (int j = i+1; j < num.length; j++) {
//                minIndex = num[j] < num [minIndex] ? j : minIndex;
//            }
//            int tmp = num[i];
//            num[i] = num[minIndex];
//            num[minIndex] = tmp;
//        }
        //冒泡
//        for (int i = num.length-1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (num[j] > num[j + 1]) {
//                    int tmp = num[j + 1];
//                    num[j + 1] = num[j];
//                    num[j] = tmp;
//                }
//            }
//        }
        //插入
//        for (int i = 1; i < num.length; i++) {
//            for (int j = i; j > 0 ; j--) {
//                if (num[j] < num[j - 1]) {
//                    int tmp = num[j - 1];
//                    num[j-1] = num[j];
//                    num[j] = tmp;
//                }
//            }
//        }
//        int[] num1 = Arrays.copyOf(num,num.length);
//        num1[0] = 5;
//        System.out.println(num);
//        for (int i = 0; i < num.length; i++) {
//            System.out.print(num[i]+" ");
//        }
//        System.out.println();
//
//        System.out.println(num1);
//        for (int i = 0; i < num1.length; i++) {
//            System.out.print(num1[i]+" ");
//        }
//        System.out.println();
        if (arrays == null || arrays.length == 0) {
            return;
        }
        process(arrays, 0, arrays.length - 1);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
        System.out.println("----------");
        for (int i = 0; i < arrays1.length; i++) {
            System.out.print(arrays1[i] + " ");
        }
        System.out.println("----------");
        System.out.println(isEqual(arrays,arrays1));
    }



    // arr[L...R]范围上，请让这个范围上的数，有序！
    public static void process(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        // int mid = (L + R) / 2
        int mid = L + ((R - L) >> 1);
        process(arr, L, mid);
        process(arr, mid + 1, R);
        merge(arr, L, mid, R);
    }

    public static void merge(int[] arr, int L, int M, int R) {
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = M + 1;
        while (p1 <= M && p2 <= R) {
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        // 要么p1越界，要么p2越界
        // 不可能出现：共同越界
        while (p1 <= M) {
            help[i++] = arr[p1++];
        }
        while (p2 <= R) {
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[L + i] = help[i];
        }
    }

    public static int[] randomArrays(int maxLength, int maxValue) {
        int length = (int) (Math.random() * maxLength)+1;
        int[] arrays = new int[length];
        int count = 0;
        while (count < length) {
            arrays[count] = (int) (Math.random() * (maxValue + 1));
            count++;
        }
        return arrays;
    }

    public static boolean isEqual(int[] arr1, int[] arr2) {
        if (arr1 == null ^ arr2 == null) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
