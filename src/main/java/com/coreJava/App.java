package com.coreJava;

import java.util.List;
import java.util.Optional;

public final class App {
  private App() {
  }

  public static void main(String[] args) {
    System.out.println(" Hello World!!!!!!! ");
    App a = new App();
    a.summer(1, 20);
  }

  void summer(long a, int b) {
    System.out.println("Int ");
  }

  // void sum ( int a , long b ){ System.out.println("Long ");} // Ambigous error
}

/*
 * Reduce Null As much as you can
 * 
 * }
 *
 * for returning Simple String/Integer ; use Optional
 * eg
 */
class SampleClass {
  /* Reduce Null As much as you can */

  public List<String> returnSampleList() {
    return List.of(); // use This , instead of return null ;
  }

  /* For String/Integer */

  public String returnSampleString() {
    return null;
  }

  // instead use
  public Optional<String> returnStrng() {
    return Optional.empty();
  }

}