package com.yuewen.constants;

/**
 * Created by duanyixiao on 2017/8/8.
 */
public enum ReturnCons {
    SUCCESS(0),
    PARTIALSUCC(1),//用于批量接口，部分成功
    FAILED(-1),
    PARAMERROR(-2),
    FILENOTEXIST(-3),
    INNEREXCEPTION(-99);


    public final int code;
    ReturnCons(int code){
        this.code = code;
    }

}
