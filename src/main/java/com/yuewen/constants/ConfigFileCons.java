package com.yuewen.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by duanyixiao on 2017/7/25.
 */

@Component
@PropertySource("data.properties")
public class ConfigFileCons {

    @Value("${currentContext}")
    public String currentContext;
}
