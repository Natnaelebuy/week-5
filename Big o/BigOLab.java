package com.javaclass;

// O(n^c) example
public class BigOLab {

  public static void main(String[] args) {
    String input[] = { "apple", "orange", "banana", "pear" };

    foo(input);
    fooFoo(input);
    bar(input);
    recur(input.length);
    fooRecur(input);
  }

  public static void foo(String[] input) {
    for (Integer i = 0; i < input.length; i++) {
      System.out.println(input[i]);
    }
  }

  public static void fooFoo(String[] input) {
    for (Integer i = 0; i < input.length; i++) {
      for (Integer j = 0; j < input.length; j++) {
        System.out.println(input[i]);
      }
    }
  }

  public static void bar(String[] input) {
    for (Integer i = 0; i < input.length; i++) {
      for (Integer j = 0; j < input.length; j++) {
        for (Integer k = 0; k < input.length; k++) {
          System.out.println(input[i]);
        }
      }
    }
  }

  public static int recur(Integer n) {
    if (n == 0) {
      return 0;
    }
    System.out.println(n);
    Integer result = n / 2;
    return result;
  }

  public static void fooRecur(String[] input) {
    for (Integer i = 0; i < input.length; i++) {
      recur(i);
    }
  }
}
