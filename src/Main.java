public class Main {
    public static void main(String[] args) {
        Article[] articles = new Article[10];   // 배열 선언 --> 생성 --> 크기가 10으로 선언 --> 모두 null 값
        articles[0] = new Article();            //article.id --> 1
        articles[1] = new Article();            //article.id --> 1
        articles[2] = new Article();
        articles[3] = new Article();
        articles[4] = new Article();
        articles[5] = new Article();
        articles[6] = new Article();

        for (Article article : articles) {
            System.out.println(articles.id);
        }
    }
}

class Article {
    static int lastId;
    int id;

    static {
        lastId = 0;
    }

    Article() {
        this(lastId + 1);
        lastId++;
    }

    Article(int id) {
        this.id = id;
    }
}