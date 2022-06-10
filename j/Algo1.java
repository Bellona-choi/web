package j;

import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.Scanner;

public class Algo1 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String H = "Hello ";
    for (int i = 0; i < num; i++) {
      if(i < num - 1){
        H += sc.next() + ",";
      }else {
        H += sc.next() + ".";
      } 
    }
    System.out.println(H);
  }
}