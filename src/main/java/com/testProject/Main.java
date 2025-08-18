package com.testProject;

import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String... arg) {
    System.out.println();
    // System.out.println( sortString("string"));//anagram(); // anagram1();
    // fibonacci(4);// System.out.println("Hello"); //palindrome();
    // bubbleSort(); // insertSort();
    startService();
  }

  static void startService() {
    int arr[] = { 3, 5, 2, 3, 4, 8, 1 }; //
    int mid = arr.length / 2;
    merge(arr, 0, arr.length);
    System.out.println("" + Arrays.toString(arr));

  }

  static void merge(int[] arr, int start, int end) {
    if (start < end) {
      int mid = (end + start) / 2;
      merge(arr, start, mid);
      merge(arr, mid + 1, end);
      merging(arr, start, mid, end);
    }
  }

  static void merging(int[] arr, int start, int mid, int end) {
    int a = mid - start;
    int b = end - mid;

    int n = mid - start;
    int[] tmp1 = new int[n];

    int m = end - mid;
    int[] tmp2 = new int[m];

    for (int i = 0; i < n; i++) {
      tmp1[i] = arr[start + i];
    }
    for (int i = 0; i < m; i++) {
      tmp2[i] = arr[start + i];
    }

    // System.out.println("-" + Arrays.toString(c));
    // System.out.println("--" + Arrays.toString(d));

    // int i = 0, j = 0, k = 0;

    // while (i < a && j < b) {
    // if (c[i] < d[j]) {
    // arr[k++] = c[i++];
    // } else {
    // arr[k++] = d[j++];
    // }
    // }

    // while (i < a) {
    // arr[k++] = c[i++];
    // }

    // while (j < b) {
    // arr[k++] = d[j++];
    // }

  }

  static void selectSort() {
    int arr[] = { 3, 5, 2, 3, 4, 8, 1 }; //
    int len = arr.length;
    for (int i = 0; i < len; i++) {
      for (int j = i; j < len; j++) {
        if (arr[j] < arr[j - 1])
          swap(arr, j, j - 1);
      }
      System.out.println(i + "->" + Arrays.toString(arr));
    }
  }

  // i->0 j&j-1 swap
  static void insertSort() {
    int arr[] = { 3, 5, 2, 3, 4, 8, 1 }; //
    int len = arr.length;
    for (int i = 0; i < len; i++) {
      for (int j = i; j > 0; j--) {
        if (arr[j] < arr[j - 1])
          swap(arr, j, j - 1);
      }
      System.out.println(i + "->" + Arrays.toString(arr));
    }
  }

  // check till len-1 j&j+1 -> swap
  static void bubbleSort() {
    int arr[] = { 5, 4, 8, 2, 1, 9, 3, 1, 7, 10 };
    int len = arr.length;
    for (int i = 0; i < len - 1; i++) {
      for (int j = 0; j < len - 1; j++) {
        if (arr[j] > arr[j + 1])
          swap(arr, j, j + 1);
      }
    }
    System.out.println(Arrays.toString(arr));
  }

  // len -> i&j -> swap
  static void bubbleSort1() {
    int arr[] = { 9, 5, 4, 8 };
    int len = arr.length;
    for (int i = 0; i < len; i++) {
      for (int j = 0; j < len; j++) {
        if (arr[i] < arr[j])
          swap(arr, i, j);
      }
      System.out.println(i + "->" + Arrays.toString(arr));
    }
    System.out.println(Arrays.toString(arr));
  }

  static void swap(int[] arr, int i, int j) {
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
  }

  static void anagram() {
    List<String> list = List.of("abab", "aabb", "bbaa", "baba", "aab", "ccd", "cdc");
    var ll = list.stream()
        .collect(Collectors.groupingBy(x -> sortString(x)));
    // .sort(Comparator.comparing( String:: valueOf)).toList();
    System.out.println(ll);
  }

  static void anagram1() {
    List<String> list = List.of("abab", "aabb", "bbaa", "baba", "aab", "ccd", "cdc");
    Map<String, List<String>> map = new HashMap<>();

    for (String val : list) {
      String sorted = sortString(val);
      if (!map.containsKey(sorted))
        map.put(sorted, new LinkedList<String>());

      var r = map.get(sorted);
      r.add(val);
      map.put(sorted, r);

    }
    System.out.println(map);

  }

  private static String sortString(String input) {
    char[] c = input.toCharArray();
    Arrays.sort(c);
    return new String(c);
  }

  static void palindrome() {
    String word = "patatapq";
    char[] arr = word.toCharArray();
    int lngth = arr.length;
    var list = word.chars()
        .mapToObj(c1 -> (char) c1)
        .collect(Collectors.toList());
    System.out.println(list);

    boolean match = true;
    for (int i = 0; i < lngth / 2; i++) {
      if (arr[i] != arr[lngth - i - 1]) {
        match = false;
        break;
      }
    }

    if (!match) {
      System.out.println("Not Palindrome");
    } else {
      System.out.println(" Palindrome");
    }

  }

  // Anagram listen stenli

  //

  static void fibonacci(int i) {
    // 4 * 3 * 2
    System.out.println(IntStream.range(1, i + 1)
        .reduce(1, (a, b) -> a * b));
  }

  static void testMethod() {
    int arr[] = { 1, 4, 6, 8, 0, 7 };
    System.out.println(arr.length);
    // String to array char /
    "MY Word".toCharArray();
    System.out.println(arr);

  }

}
