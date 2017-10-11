import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by duanyixiao on 2017/9/27.
 */
public class JsoupTest {
    public static void main(String[] args) {
        try {
            //解析Url获取Document对象
            Document document = Jsoup.connect("https://m.qidian.com/book/1006629321/catalog").get();
//            Document document = Jsoup.connect("https://m.qidian.com/book/1009329519/catalog").get();
            System.out.println(document.select("chapter-ol chapter-ol-catalog").size());
            //获取指定class的内容指定tag的元素
            Elements liElements = document.getElementsByClass("chapter-ol chapter-ol-catalog").get(0).getElementsByTag("li");
            System.out.println(liElements.size());
            for (int i = liElements.size()-1; i > liElements.size()-10; i--) {
                Element element = liElements.get(i);
                System.out.println(element.text()+" chapterid="+ element.getElementsByTag("a").get(0).attr("data-chapter-id"));
            }
        } catch (IOException e) {
            System.out.println("解析出错！");
            e.printStackTrace();
        }

    }
}
