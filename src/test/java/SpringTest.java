import com.yuewen.config.AppConfig;
import com.yuewen.constants.ConfigFileCons;
import com.yuewen.repository.db.model.Usertag;
import com.yuewen.service.RedisClient;
import com.yuewen.util.DynamicDBUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by duanyixiao on 2017/7/25.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {AppConfig.class, ConfigFileCons.class})
public class SpringTest {


    @Autowired
    private AppConfig appConfig;

    @Autowired
    private ConfigFileCons databaseCons;


    @Autowired
    private RedisClient redisClient;

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
        List<Usertag> list = generalMapper.selectAll();
        list.forEach(System.out::println);

    }

    @Test
    public void testRedis(){
        redisClient.hgetAll("redis").ifPresent(System.out::println);
    }

    @Test
    public void testPropersties() {
//        PageHelper.startPage(2,5);
        DynamicDBUtils.setDatabaseName("usertag1");
        List<Usertag> list = generalMapper.selectAll();
        list.forEach(System.out::println);

    }


}
