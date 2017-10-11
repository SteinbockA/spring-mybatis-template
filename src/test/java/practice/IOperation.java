package practice;

import com.google.common.base.Preconditions;
import org.apache.commons.lang3.time.StopWatch;

import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by duanyixiao on 2017/9/30.
 */
public enum IOperation {
    add(1),
    delete(2),
    mutiply(3);

    private int num;
    private static final Map<Integer,IOperation> container = new HashMap<>();

    IOperation(int num){
        this.num = num;
    }


    static {
        for (IOperation operation : IOperation.values()) {
            container.put(operation.num,operation);
        }
    }

    public static void main(String[] args) throws Exception {
        StopWatch stopWatch = new StopWatch();
        long start = System.nanoTime();
        stopWatch.start();
        List<String> list = new ArrayList<String>();
        Class tclass = list.getClass();
        Method method = tclass.getDeclaredMethod("add",Object.class);
        method.invoke(list,1);
        System.out.println(stopWatch.getTime());
        System.out.println((System.nanoTime()-start));
        System.out.println(stopWatch.getNanoTime());

    }

}
