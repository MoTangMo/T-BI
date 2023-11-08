package t.example.system.bi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import t.example.system.bi.domain.Chart;
import t.example.system.bi.service.ChartService;
import t.example.system.bi.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2023-11-08 10:55:40
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




