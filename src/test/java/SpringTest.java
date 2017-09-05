import com.yuewen.TestService;
import com.yuewen.config.AppConfig;
import com.yuewen.constants.ConfigFileCons;
import com.yuewen.mapper.IMapper;
import com.yuewen.mapper.GeneralMapper;
import com.yuewen.mapper.UsertagMapper;
import com.yuewen.model.Usertag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

/**
 * Created by duanyixiao on 2017/7/25.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class SpringTest {


    @Autowired
    private AppConfig appConfig;

    @Autowired
    private ConfigFileCons databaseCons;

    @Autowired
    private UsertagMapper usertagMapper;

    @Autowired
    private GeneralMapper generalMapper;

    @Autowired
    private IMapper mapper;

    @Autowired
    private TestService testService;



    @Test
    public void testMybatis() {
//        List<Usertag> list = usertagMapper.getAllWithMapper();
//        System.out.println(list);

        String url = "%s";
        System.out.println(String.format(url,"here"));

    }

    @Test
    public void testProperties() {
//        PageHelper.startPage(2,5);
        Condition condition = new Condition(Usertag.class);
        condition.or().andLessThan("userid",3);
        List<Usertag> list = mapper.selectByExample(condition);
        list.forEach(System.out::println);


    }

    @Test
    public void testService(){
        List<Usertag> list = testService.test();
        list.forEach(System.out::println);


    }


}
