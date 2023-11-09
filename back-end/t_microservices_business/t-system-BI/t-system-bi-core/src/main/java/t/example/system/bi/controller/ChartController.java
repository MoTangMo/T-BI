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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import t.example.system.bi.domain.Chart;
import t.example.system.bi.domain.condition.ChartCondition;
import t.example.system.bi.service.ChartService;
import t.microservices.fw.common.interResult.R;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈BI图表控制器〉
 *
 * @author Administrator
 * @create 11/8/2023 11:05 AM
 * @since 1.0.0
 */
@RestController
@Tag(name = "图表模块")
@RequestMapping("system")
@CrossOrigin
public class ChartController {

    @Autowired
    private ChartService service;


    /**
     * @Description  根据条件查询所有图表
     * @Author
     * @Date
     * @Param
     * @return
    **/
    @PostMapping ("charts")
    @Operation(summary = "根据条件查询图表信息")
    public R getChartList(ChartCondition condition){
        List<Chart> listByCondition = service.getListByCondition(condition);
        return  R.success(listByCondition);
    }


    /**
     * @Description 添加数据
     * @Author T
     * @Date
     * @Param
     * @return
    */
    @PostMapping("insertChart")
    @Operation(summary = "添加图表信息")
    public R insertChart(@RequestBody  Chart chart){
        boolean save = service.save(chart);
        return R.success();
    }


    /**
     * @Description 修改图表数据
     * @Author T
     * @Date
     * @Param
     * @return
    */
    @PutMapping("updateChart")
    @Operation(summary = "更新图表信息")
    public R updateChart(@RequestBody  Chart chart){
        boolean b = service.updateById(chart);
        return R.success();
    }


    /**
     * @Description 删除图表数据
     * @Author T
     * @Date
     * @Param
     * @return
     */
    @DeleteMapping("delChart")
    @Operation(summary = "删除图表信息")
    public R delChart(@RequestBody Chart chart){
        boolean b = service.removeById(chart);
        return R.success();
    }



}
