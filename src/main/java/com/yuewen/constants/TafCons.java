package com.yuewen.constants;

/**
 * Created by duanyixiao on 2017/8/30.
 */
public class TafCons {
    public static final String BOOK_SERVANT = "QD.BookService.BookObj";
    public static final String BOOK_LOCATOR = "taf.tafregistry.shQueryObj@tcp -h 10.206.2.100 -p 17890:tcp -h 10.206.6.11 -p 17890:tcp -h 10.237.5.176 -p 17890:tcp -h 10.237.7.103 -p 17890";

    public static final String YUEWENLICENSE_SERVANT = "UserBase.YuewenLicenseServer.YuewenLicenseServant";
    public static final String YUEWENLICENSE_LOCATOR = "taf.tafregistry.shQueryObj@tcp -h 10.206.2.100 -p 17890:tcp -h 10.206.6.11 -p 17890:tcp -h 10.237.5.176 -p 17890:tcp -h 10.237.7.103 -p 17890";

    //ID转换
    public static final String IDCONVERT_LOCATOR = "taf.tafregistry.shQueryObj@tcp -h 10.206.2.100 -p 17890:tcp -h 10.206.6.11 -p 17890:tcp -h 10.237.5.176 -p 17890:tcp -h 10.237.7.103 -p 17890";
    public static final String IDCONVERT_SERVANT = "QD.UniteIdConvertServer3.UniteIdConvertServant";
}
