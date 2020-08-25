package cn.sz.twoOfGroup.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {

    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.basePackage("cn.sz.twoOfGroup")).paths(PathSelectors.any()).build();
    }

    public ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("STS系统接口文档").description("STS系统所需的后端接口API文档").termsOfServiceUrl("/").version("1.0").build();
    }
}
