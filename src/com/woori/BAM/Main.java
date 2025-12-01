package com.woori.BAM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("==프로그램 시작==");
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.printf("cmd) ");
            String cmd = in.next();
            System.out.println("명령어) " + cmd);

            if (cmd == "exit") {
                break;
            }

            if (cmd.equals("exit")) {
                break;
            }
        }
        System.out.printf("cmd) ");
        String cmd = in.nextLine();
        System.out.println("명령어) " + cmd);
        System.out.println("==프로그램 종료==");
    }
}
