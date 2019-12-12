package com.cjtc.sso.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@PropertySource(value = "classpath:application.yml")
public class WeChatAccountConfig {
    @Value("${server.port}")
    private String serverPort;
}
