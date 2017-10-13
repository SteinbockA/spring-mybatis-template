import com.yuewen.config.AppConfig;
import com.yuewen.constants.ConfigFileCons;
import com.yuewen.db.dao.UsertagDao;
import com.yuewen.db.mapper.IMapper;
import com.yuewen.db.model.Usertag;
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
    private IMapper mapper;

    @Autowired
    private UsertagDao usertagDao;



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
        usertagDao.duplicateinsert();


    }


}
