package com.woori.BAM.dto;

class Article {
    int id;
    String title;
    String body;
    String regDate;
    int viewCnt;

    public Article(int lastArticleID, String title, String body, String regDate, int viewCnt) {
        this.id = lastArticleID;
        this.title = title;
        this.body = body;
        this.regDate = regDate;
        this.viewCnt = viewCnt;
    }

    void increaseViewCnt() {
        this.viewCnt++;
    }
}