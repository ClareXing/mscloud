package com.xhl.springcloud.alibaba.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class ConfigClientController
{

   // nacos 增加配置公式 ${spring.application.name}-${spring.profile.active}.${spring.cloud.nacos.config.file-extension}
    //@RefreshScope  实现自动更新
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }
}
