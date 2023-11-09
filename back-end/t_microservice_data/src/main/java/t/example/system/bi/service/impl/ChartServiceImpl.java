package t.example.system.bi.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ReflectUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import t.example.system.bi.domain.Chart;
import t.example.system.bi.domain.condition.ChartCondition;
import t.example.system.bi.service.ChartService;
import t.example.system.bi.mapper.ChartMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
* @author Administrator
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2023-11-08 10:55:40
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{



    /**
     * @Description 根据条件查询图表信息
     * @Author
     * @Date
     * @Param
     * @return
    */
    @Override
    public List<Chart> getListByCondition(ChartCondition condition) {
        QueryWrapper<Chart> queryWrapper = makeQueryWrapper(condition);
        return baseMapper.selectList(queryWrapper);
    }


    /**
     * @Description 生成 QueryWrapper 比较参数
     * @Author
     * @Date
     * @Param
     * @return
    */
    private QueryWrapper<Chart> makeQueryWrapper(ChartCondition condition){
        QueryWrapper<Chart> queryWrapper = new QueryWrapper<>();
        Map<String, Object> conditionMap = BeanUtil.beanToMap(condition);
        conditionMap.forEach((k,v) -> {
            if (conditionMap.get(k) != null){
                queryWrapper.eq(k,v.toString());
            }
        });
        return queryWrapper;
    }



}




