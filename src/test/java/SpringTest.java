import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.*;
import com.yuewen.config.AppConfig;
import com.yuewen.constants.ConfigFileCons;
import com.yuewen.dao.UsertagDao;
import com.yuewen.mapper.IMapper;
import com.yuewen.model.Usertag;
import org.apache.commons.lang3.math.NumberUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;

import java.util.*;
import java.util.concurrent.*;

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
    public void update(){
        usertagDao.testTransaction();
    }
    @Test
    public void testMybatis() {
//        List<Usertag> list = usertagMapper.getAllWithMapper();
//        System.out.println(list);

        String url = "%s";
        System.out.println(String.format(url, "here"));

    }

    @Test
    public void testProperties() {
//        PageHelper.startPage(2,5);
        Condition condition = new Condition(Usertag.class);
        condition.or().andLessThan("userid", 3);
        List<Usertag> list = mapper.selectByExample(condition);
        list.forEach(System.out::println);


    }

    @Test
    public void testService() {
        int start = 0;
        int end = 0;
        int partition = (int) (Math.ceil(32 / 5.0));
        for (int i = 0; i < partition; i++) {
            end = NumberUtils.min(32, start + 5);
            System.out.println("start=" + start + " end=" + end);
            start = end;
        }
    }

    @Test
    public void testGroup() {
        int start = 0;
        int end = 0;
        int partition = (int) (Math.ceil(32 / 5.0));
        while (start < 32) {
            end = NumberUtils.min(32, start + partition);
            System.out.println("start=" + start + " end" + end);
            start = end;
        }
    }

    @Test
    public void testAnother() {
        List<Integer> list = Lists.newArrayList();
        for (int i = 0; i < 43; i++)
            list.add(i);
        List<List<Integer>> partition = Lists.partition(list, 7);
        partition.forEach(System.out::println);
    }

    @Test
    public void testSort() {
        Ordering<String> ordering = Ordering.natural().nullsFirst().onResultOf(s -> s.getBytes()[0]);
        ArrayList<String> strings = Lists.newArrayList("abc", "re", "be", "er");
        Set<Integer> set1 = Sets.newHashSet(1, 2, 3);
        Set<Integer> set2 = Sets.newHashSet(2, 3, 4);
        Set<Integer> res = Sets.symmetricDifference(set2, set1);
        System.out.println(res);


    }

    @Test
    public void testMaps() {
        Map<String, Integer> map1 = Maps.newHashMap();
        map1.put("redis", 1);
        map1.put("test", 2);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("redis", 1);
        map2.put("test", 3);
        MapDifference mapDifference = Maps.difference(map1, map2);
        System.out.println(mapDifference.entriesOnlyOnLeft());

    }

    @Test
    public void multiset() {
        Multimap<String, Integer> multimap = HashMultimap.create();
        multimap.put("redis", 1);
        multimap.put("redis", 2);
        multimap.put("redis", 3);
        multimap.put("test", 4);
        Multiset<String> multiset = multimap.keys();
        for (Multiset.Entry<String> entry : multiset.entrySet()) {
            System.out.println(entry.getElement());
            System.out.println(entry.getCount());
        }
    }

    @Test
    public void guavacache() {
        LoadingCache<String, Integer> loadingCache = CacheBuilder.newBuilder().build(new CacheLoader<String, Integer>() {
            @Override
            public Integer load(String s) throws Exception {
                return 1;
            }
        });

        Cache<String, Integer> cache = CacheBuilder.newBuilder().build();
    }

    @Test
    public void executorTest() {
        ExecutorService executorService = new ThreadPoolExecutor(10, 10, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        CompletionService<String> completionService = new ExecutorCompletionService<String>(executorService);
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            completionService.submit(() -> {
                Random random = new Random();
                int time = random.nextInt(10) * 100;
                try {
                    Thread.sleep(time);
                } catch (Exception e) {

                }
                countDownLatch.countDown();
                return Thread.currentThread().getName();
            });

        }
        try {
            for (int i = 0; i < 10; i++) {
                Future<String> future = completionService.poll(1000,TimeUnit.MILLISECONDS);
                try {
                    System.out.println("res=" + future.get());
                } catch (Exception e) {
                    System.out.println(i);
                }
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }catch (Exception e){

        }

    }


}
