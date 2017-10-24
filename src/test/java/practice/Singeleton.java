package practice;

import java.io.Serializable;

/**
 * Created by duanyixiao on 2017/10/22.
 */
public class Singeleton implements Serializable {
    private static final Singeleton sing = new Singeleton();

    private Singeleton(){}

    public static Singeleton getInstance(){
        return sing;
    }


}
