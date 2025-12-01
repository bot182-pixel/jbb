package com.woori.BAM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("==프로그램 시작==");
        Scanner in = new Scanner(System.in);
        int id = 1;                 //게시글의 번호를 저장한다
        while (true) {
            System.out.printf("명령어) ");
            String cmd = in.nextLine();
            System.out.println("명령어) " + cmd);

            if (cmd.length() == 0) {
                System.out.println("명령어를 입력해주세요");
                continue;           //반복문을 처음부터 다시 진행
            }

            if (cmd.equals("article list")) {
                System.out.println("게시글이 없습니다");
            } else if (cmd.equals("article write")) {
                System.out.print("제목 :");
                String title = in.nextLine().trim();    //trim(); 앞뒤의 공백을 제거
                System.out.println("내용 :");
                String body = in.nextLine();
                System.out.println(id + " 번글이 생성되었습니다");
                id++;
            } else {
                System.out.println("존재하지 않는 명령어입니다.");
            }

            if (cmd.equals("exit")) {
                break;
            }
        }

        String cmd = in.nextLine();
        System.out.println("==프로그램 종료==");
    }
}
