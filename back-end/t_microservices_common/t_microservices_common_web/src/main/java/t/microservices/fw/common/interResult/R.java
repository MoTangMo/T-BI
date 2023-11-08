/**
 * FileName: Result
 * Author:   Administrator
 * Date:     2023/8/1 15:56
 * Description: 接口统一返回结果
 * History:
 * <author>          <time>          <version>          <desc>
 *   T           2023/8/1 15:56          1.0              接口统一返回结果
 */
package t.microservices.fw.common.interResult;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import t.microservices.fw.common.result.ResultEnum;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈接口统一返回结果〉
 *
 * @author Administrator
 * @create 2023/8/1 15:56
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class R<T> implements Serializable {

     public Integer code;

     public String message;

     public T data;

    public R(Integer code ,String message){
        this.code = code ;
        this.message = message;
    }

    /**
     * @Description 返回一个成功结果
     * @Author T
     * @Date 2023/8/1 15:56
     * @Param data
     * @return 返回统一成功结果
    */
    public static <T> R success(T data){
        return new R(ResultEnum.SUCCESS.getCode(),ResultEnum.SUCCESS.getMessage(),data);
    }

    /**
     * @Description 返回一个成功结果
     * @Author T
     * @Date 2023/8/1 15:56
     * @Param null
     * @return 返回统一成功结果
     */
    public static R success(){
        return new R(ResultEnum.SUCCESS.getCode(),ResultEnum.SUCCESS.getMessage());
    }

    /**
     * @Description 返回一个失败的结果
     * @Author T
     * @Date 2023/8/1 15:56
     * @Param null
     * @return 返回一个统一的失败结果
    */
    public static R fail(){
        return new R(ResultEnum.FAIL.getCode(), ResultEnum.FAIL.getMessage());
    }

    /**
     * @Description 返回一个失败的带有信息的结果
     * @Author T
     * @Date 2023/8/1 15:56
     * @Param null
     * @return 返回一个统一的失败结果
     */
    public static <T> R fail(T data){
        return new R(ResultEnum.FAIL.getCode(), ResultEnum.FAIL.getMessage(),data);
    }
}
