package com.puhuijia.back.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * alibaba dubbo RPC服务框架配置
 * <p>Copyright © JinNuoFeng Network Technology Co.,Ltd.</p>
 * Created by Alan on 2017/8/11.
 */
@Configuration
@ImportResource({"classpath:dubbo/*.xml"})
public class DubboConfig {
}
