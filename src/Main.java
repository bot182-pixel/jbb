import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Article[] articles = new Article[10];
        articles[0] = new Article();
        articles[1] = new Article();
        exam01();
        exam02();
    }

    static void exam01() {
        int articleLength = 0;
        Article[] articles = new Article[10];

        articles[0] = new Article();
        articleLength++;
        articles[1] = new Article();
        articleLength++;
        articles[2] = new Article();
        articleLength++;
        articles[3] = new Article();
        articleLength++;
        articles[4] = new Article();
        articleLength++;
        articles[5] = new Article();
        articleLength++;

        for (Article article : articles) {

            System.out.println(article.id);

            for (int i = 0; i < articleLength; i++) {
//                Article articles = article[i];
                System.out.println(article.id);
            }


        }

    }

    static void exam02() {
        ArrayList articles = new ArrayList();
        articles.add(articles);
        articles.add("asf");
        articles.add(1);
        articles.add(false);
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());

        for (int i=0; i < articles.size(); i++) {
            Article article = (Article) articles.get(i);    //강제 형변환
            System.out.println();
        }
    }

    static class Article {
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
}