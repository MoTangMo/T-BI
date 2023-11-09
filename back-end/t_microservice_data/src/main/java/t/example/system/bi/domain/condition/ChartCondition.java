/**
 * FileName: ChartCondition
 * Author:   Administrator
 * Date:     11/8/2023 5:04 PM
 * Description: 条件查询封装类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package t.example.system.bi.domain.condition;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈条件查询封装类〉
 *
 * @author Administrator
 * @create 11/8/2023 5:04 PM
 * @since 1.0.0
 */
@Data
public class ChartCondition implements Serializable {



    /**
     * 分析目标
     */
    private String goal;

    /**
     * 图表名称
     */
    private String name;


    /**
     * 图表类型
     */
    private String chartType;



    private String status;




    private Long userId;



    private static final long serialVersionUID = 1L;

}
