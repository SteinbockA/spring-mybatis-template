package practice;

import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by duanyixiao on 2017/10/22.
 */
public class Main {
    public static void main(String[] args) throws Exception {

    }

    private static void test1() throws Exception{
        Singeleton s1 = Singeleton.getInstance();

        Constructor method = Singeleton.class.getDeclaredConstructor();
        method.setAccessible(true);
        Singeleton s3 = (Singeleton) method.newInstance();
        System.out.println(s3.getClass().getName());
        System.out.println(s1==s3);
    }

    private static void test2() throws Exception{
        Singeleton s1 = Singeleton.getInstance();
        Singeleton s2 = Singeleton.getInstance();
        System.out.println(s1==s2);



    }
}
