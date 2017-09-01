package com.yuewen.constants;

/**
 * Created by duanyixiao on 2017/8/8.
 */
public enum ReturnCons {
    SUCCESS(0),
    PARTIALSUCC(1),//用于批量接口，部分成功
    FAILED(-1),
    PARAMERROR(-99),
    INNEREXCEPTION(-98),
    FILENOTEXIST(-97),
    ERROR(-96);

    public final int code;
    ReturnCons(int code){
        this.code = code;
    }

}
