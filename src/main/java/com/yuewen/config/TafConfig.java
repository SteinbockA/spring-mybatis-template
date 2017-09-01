package com.yuewen.config;

import com.qq.cloud.taf.client.Communicator;
import com.qq.cloud.taf.client.CommunicatorConfig;
import com.qq.cloud.taf.client.CommunicatorFactory;
import com.qq.cloud.taf.client.ServantProxyConfig;
import com.yuewen.constants.TafCons;
import com.yuewen.taf.client.uniteidconvert.servant.UniteIdConvertServantPrx;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by duanyixiao on 2017/8/9.
 */
@Configuration
public class TafConfig {
    private  <T> T getPrx(Class<T> t, String locator, String servant) {
        CommunicatorConfig communicatorConfig = new CommunicatorConfig();
        communicatorConfig.setLocator(locator);
        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(communicatorConfig);

        ServantProxyConfig servantProxyConfig = new ServantProxyConfig(servant);
        servantProxyConfig.setModuleName("AuthInfo");
        servantProxyConfig.setConnectTimeout(3000);
        servantProxyConfig.setCharsetName("UTF-8");

        return communicator.stringToProxy(t, servantProxyConfig);
    }

    @Bean
    public UniteIdConvertServantPrx uniteIdConvertServantPrx(){
        return getPrx(UniteIdConvertServantPrx.class, TafCons.IDCONVERT_LOCATOR, TafCons.IDCONVERT_SERVANT);
    }


}
