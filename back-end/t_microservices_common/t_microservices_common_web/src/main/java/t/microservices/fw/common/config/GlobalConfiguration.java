/**
 * FileName: GlobalConfiguration
 * Author:   Administrator
 * Date:     2023/8/1 16:37
 * Description: 统一的装配配置组件
 * History:
 * <author>          <time>          <version>          <desc>
 *    T           2023/8/1 16:37           1.0              统一的装配配置组件
 */
package t.microservices.fw.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import t.microservices.fw.common.exception.GlobalExceptionHandler;

/**
 * 〈一句话功能简述〉<br> 
 * 〈统一的装配配置组件〉
 *
 * @author Administrator
 * @create 2023/8/1 16:37
 * @since 1.0.0
 */
@Configuration
public class GlobalConfiguration {

    @Bean
    public GlobalExceptionHandler exceptionHandler(){
        return  new GlobalExceptionHandler();
    }
}
