package practice;

import lombok.Data;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapping;

/**
 * Created by duanyixiao on 2017/10/5.
 */
@Data
public class Source {
    @Mapping("a")
    private String name;
    @Mapping("b")
    private int age;
    @Mapping("c")
    private int sex;

    public static void main(String[] args) {
        DozerBeanMapper mapper = new DozerBeanMapper();
        Source source  = new Source();
        source.name = "duan";
        source.age = 28;
        source.sex = 0;
        System.out.println(source);
        System.out.println(mapper.map(source,Target.class));

    }
}
