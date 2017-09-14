import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by duanyixiao on 2017/9/9.
 */
public class ListTest {
    public static void tests(List list){
        System.out.println(list);
    }

    public static void test2(List<?> lsit){
        System.out.println(lsit);
    }

    public static void test3(List<? super Number> list){
        System.out.println(list);
    }



    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        test3(list);


    }
}
