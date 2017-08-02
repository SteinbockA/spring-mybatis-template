package com.yuewen.taf;

import com.qq.cloud.taf.server.core.*;
import com.qq.cloud.taf.support.om.CustemCommandHelper;
import com.yuewen.taf.command.TestCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by duanyixiao on 2017/7/11.
 */
public class TafAppListener implements AppContextListener {
    private static final Logger logger = LoggerFactory.getLogger(TafAppListener.class);
    private static AppContext appCtx;
    private static Map<Class<?>, Object> servants = new HashMap<>();
    private static ApplicationContext applicationContext;

    public static final AppContext getAppCtx() {
        return appCtx;
    }

    public static final <T> T getServant(Class<T> apiClass) {
        return (T) servants.get(apiClass);
    }

    @Override
    public void appContextStarted(AppContextEvent event) {
        TafAppListener.appCtx = event.getAppContext();
        CustemCommandHelper.getInstance().registerCustemHandler("com/yuewen/test", new TestCommand());
//        CustemCommandHelper.getInstance().registerCustemHandler(Constants.CMD_SCHEDULE_READSYNC_START, new BookmarkCommand());
//        CustemCommandHelper.getInstance().registerCustemHandler(Constants.CMD_SCHEDULE_TIMESYNC_STOP, new BookmarkCommand());
//        CustemCommandHelper.getInstance().registerCustemHandler(Constants.CMD_SCHEDULE_READSYNC_STOP, new BookmarkCommand());
//        CustemCommandHelper.getInstance().registerCustemHandler(Constants.CMD_HANDSYNC, new BookmarkCommand());
//        CustemCommandHelper.getInstance().registerCustemHandler(Constants.CMD_HANDDEL, new BookmarkCommand());
    }

    @Override
    public void appServiceStarted(AppServiceEvent event) {
        ServiceHomeSkeleton skeleton = (ServiceHomeSkeleton) event.getAppService();
        servants.put(skeleton.getApiClass(), skeleton.getService());
    }
}
