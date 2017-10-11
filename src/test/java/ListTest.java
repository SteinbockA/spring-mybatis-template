import com.google.common.collect.Lists;
import lombok.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by duanyixiao on 2017/9/9.
 */
@Data
@Builder
public class ListTest {
    private String name;
    private int age;
    private int sex;
    @Singular private List<Integer> secrets;

    public static void main(String[] args) {
        ListTest listTest = new ListTest.ListTestBuilder().secret(10).build();
        System.out.println(listTest.getSecrets());
    }
}
