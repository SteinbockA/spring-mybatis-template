package com.yuewen.taf;

import com.qq.cloud.taf.client.Communicator;
import com.qq.cloud.taf.client.CommunicatorConfig;
import com.qq.cloud.taf.client.CommunicatorFactory;
import com.qq.cloud.taf.client.ServantProxyConfig;
import com.yuewen.taf.client.uniteidconvert.servant.UniteIdConvertServantPrx;

import static com.yuewen.constants.TafCons.IDCONVERT_LOCATOR;
import static com.yuewen.constants.TafCons.IDCONVERT_SERVANT;

/**
 * Created by duanyixiao on 2017/8/9.
 */
public class TafServcie {
    private static <T> T getPrx(Class<T> t, String locator, String servant){
        CommunicatorConfig communicatorConfig = new CommunicatorConfig();
        communicatorConfig.setLocator(locator);
        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(communicatorConfig);

        ServantProxyConfig servantProxyConfig = new ServantProxyConfig(servant);
        servantProxyConfig.setModuleName("QQChapterCompare");
        servantProxyConfig.setConnectTimeout(5000);
        servantProxyConfig.setCharsetName("UTF-8");

        return communicator.stringToProxy(t,servantProxyConfig);
    }


    public static UniteIdConvertServantPrx uniteIdConvertServantPrx(){
        return TafServcie.getPrx(UniteIdConvertServantPrx.class, IDCONVERT_LOCATOR, IDCONVERT_SERVANT);
    }



}
