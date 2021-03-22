package com.glodon.config;

import com.glodon.common.config.BaseSwaggerConfig;
import com.glodon.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by macro on 2018/4/26.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.glodon.modules")
                .title("glodon-tiny项目骨架")
                .description("glodon-tiny项目骨架相关接口文档")
                .contactName("ruleDatabase")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
