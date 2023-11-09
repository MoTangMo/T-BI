package t.example.system.bi.service;

import t.example.system.bi.domain.Chart;
import com.baomidou.mybatisplus.extension.service.IService;
import t.example.system.bi.domain.condition.ChartCondition;

import java.util.List;

/**
* @author Administrator
* @description 针对表【chart(图表信息表)】的数据库操作Service
* @createDate 2023-11-08 10:55:40
*/
public interface ChartService extends IService<Chart> {

    List<Chart> getListByCondition(ChartCondition condition);


}
