package com.yuewen.constants;

/**
 * Created by duanyixiao on 2017/8/30.
 */
public interface TafCons {
    String COMMONAUTH_SERVANT = "Book.CommonAuthServer.CommonAuthServant";
    String COMMONAUTH_LOCATOR = "taf.tafregistry.QueryObj@tcp -h 10.219.140.217 -p 17890:tcp -h 10.224.137.102 -p 17890";

    String BOOK_SERVANT = "QD.BookService.BookObj";
    String BOOK_LOCATOR = "taf.tafregistry.shQueryObj@tcp -h 10.206.2.100 -p 17890:tcp -h 10.206.6.11 -p 17890:tcp -h 10.237.5.176 -p 17890:tcp -h 10.237.7.103 -p 17890";

    String YUEWENLICENSE_SERVANT = "UserBase.YuewenLicenseServer.YuewenLicenseServant";
    String YUEWENLICENSE_LOCATOR = "taf.tafregistry.shQueryObj@tcp -h 10.206.2.100 -p 17890:tcp -h 10.206.6.11 -p 17890:tcp -h 10.237.5.176 -p 17890:tcp -h 10.237.7.103 -p 17890";

    //ID转换
    String IDCONVERT_LOCATOR = "taf.tafregistry.shQueryObj@tcp -h 10.206.2.100 -p 17890:tcp -h 10.206.6.11 -p 17890:tcp -h 10.237.5.176 -p 17890:tcp -h 10.237.7.103 -p 17890";
    String IDCONVERT_SERVANT = "QD.UniteIdConvertServer3.UniteIdConvertServant";
}
