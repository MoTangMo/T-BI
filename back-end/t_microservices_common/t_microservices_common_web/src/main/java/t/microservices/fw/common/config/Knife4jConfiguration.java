/**
 * FileName: Knife4jConfiguration
 * Author:   Administrator
 * Date:     11/9/2023 11:08 AM
 * Description: Knife4j装配
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package t.microservices.fw.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Knife4j装配〉
 *
 * @author Administrator
 * @create 11/9/2023 11:08 AM
 * @since 1.0.0
 */
@Configuration
@EnableSwagger2WebMvc
public class Knife4jConfiguration {

    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
        Docket docket=new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        //.title("swagger-bootstrap-ui-demo RESTful APIs")
                        .description(" T-BI 接 口 文 档 ")
                        .termsOfServiceUrl("http://www.tbi.com/")
                        .contact("www1532621280@qq.com")
                        .version("1.0")
                        .build())
                //分组名称
                .groupName("BITable")
                .select()
                //这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("t.example.system.bi.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
}