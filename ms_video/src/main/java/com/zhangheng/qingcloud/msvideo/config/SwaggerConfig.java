package com.zhangheng.qingcloud.msvideo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * SwaggerConfig
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zhangheng.qingcloud.msvideo.controller"))
                .paths(PathSelectors.any())
                .build();
    }

 
    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "视频弹幕机Resful API", "","1.0", "", "万事屋","", null);
        return apiInfo;
    }
}