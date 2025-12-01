package com.woori.BAM;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("==프로그램 시작==");
        Scanner in = new Scanner(System.in);
        int id = 1;                 //게시글의 번호를 저장한다

        List<Article> articles = new ArrayList<>();    // 변수 articles 의 타입 --> 제너릭 <article>

        while (true) {
            System.out.printf("cmd) ");
            String cmd = in.nextLine().trim();
            System.out.println("명령어) " + cmd);

            if (cmd.length() == 0) {
                System.out.println("명령어를 입력해주세요");
                continue;           //반복문을 처음부터 다시 진행
            }

            if (cmd.equals("article list")) {
                if (articles.size() == 0) {
                    System.out.println("게시글이 없습니다");
                    continue;
                }

                System.out.println("번호   |   제목");
                for (int i = 0 ; i < articles.size() ; i++) {
                    Article article = articles.get(i);
                    System.out.printf("%d   |   %s\n" , article.id, article.title);
                }


            } else if (cmd.equals("article write")) {
                System.out.print("제목 : ");
                String title = in.nextLine();
                System.out.println("내용 : ");
                String body = in.nextLine();
                System.out.println(id + " 번글이 생성되었습니다");

                Article article = new Article();
                article.id = id;
                article.title = title;
                article.body = body;

                articles.add(article);
                id++;

            } else {
                System.out.println("존재하지 않는 명령어입니다.");
            }

            if (cmd.equals("exit")) {
                break;
            }

//            System.out.println("id :"+ id);
//            System.out.println("title : " + title);
//            System.out.println("body : " + body);
        }

        System.out.println("==프로그램 종료==");
    }
}

class Article {
    int id;
    String title;
    String body;

}