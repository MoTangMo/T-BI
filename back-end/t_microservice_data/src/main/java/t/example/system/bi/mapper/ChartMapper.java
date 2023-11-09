package t.example.system.bi.mapper;

import t.example.system.bi.domain.Chart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author Administrator
* @description 针对表【chart(图表信息表)】的数据库操作Mapper
* @createDate 2023-11-08 10:55:40
* @Entity t.example.system.bi.domain.Chart
*/
public interface ChartMapper extends BaseMapper<Chart> {

    List<Chart> getListByCondition();

}




