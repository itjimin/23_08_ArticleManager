package com.KoreaIT.java.AM;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("=== 프로그램 시작 ===");
    Scanner sc = new Scanner(System.in);

    System.out.printf("명령어 ) ");
  // sc.nextLine();      // 입력 받기(1)

    String cmd = sc.next();

    cmd = sc.next();                  // 지금 여기서는 nextLine()이 두개 있으니까 입력 두번받고 종료됨(2)
    System.out.printf("입력된 명령어 : %s\n" , cmd);

    int num = sc.nextInt();


    sc.close();             // 엔터치고 프로그램 종료

    System.out.println("=== 프로그램 종료 ===");


  }
}