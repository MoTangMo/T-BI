/**
 * FileName: ChartController
 * Author:   Administrator
 * Date:     11/8/2023 11:05 AM
 * Description: BI图表控制器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package t.example.system.bi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import t.microservices.fw.common.interResult.R;

/**
 * 〈一句话功能简述〉<br> 
 * 〈BI图表控制器〉
 *
 * @author Administrator
 * @create 11/8/2023 11:05 AM
 * @since 1.0.0
 */
@RestController
@RequestMapping("system")
public class ChartController {

    @GetMapping("")
    public R test(){
        return  R.success();
    }

}
