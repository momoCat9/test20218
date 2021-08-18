package com.cui.config;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2     //开启Swagger2
public class SwaggerConfig {
    //各个服务的包的扫描
    Predicate<RequestHandler> cuiPredicate = RequestHandlerSelectors.basePackage("com.cui.controller");

    //配置Swagger的Docket的Bean实例
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(Predicates.or(cuiPredicate)) //扫描包
                .paths(PathSelectors.any())         // 所有controller
                .build();
    }

    //配置Swagger信息
    private ApiInfo apiInfo(){

        return new ApiInfoBuilder()
                .title("Hello接口api")                       // 文档页标题
                .contact(new Contact("cui",
                        "https://www.cui.com",
                        "abc@163.com"))                   // 联系人信息
                .description("为项目提供的api文档")                // 详细信息
                .version("1.0.1")                               // 文档版本号
                .termsOfServiceUrl("https://www.baidu.com")     // 网站地址
                .build();
    }
}
