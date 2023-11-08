/**
 * FileName: BIApplication
 * Author:   Administrator
 * Date:     11/7/2023 5:22 PM
 * Description: 智能BI启动类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package t.example.system.bi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 〈一句话功能简述〉<br> 
 * 〈智能BI启动类〉
 *
 * @author Administrator
 * @create 11/7/2023 5:22 PM
 * @since 1.0.0
 */
@SpringBootApplication
@MapperScan({"t.example.system.bi.mapper"})
public class BIApplication {

    public static void main(String[] args) {
        SpringApplication.run(BIApplication.class);
    }

}
