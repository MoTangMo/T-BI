/**
 * FileName: exceptionHandler
 * Author:   Administrator
 * Date:     2023/8/1 16:31
 * Description: 统一的异常处理
 * History:
 * <author>          <time>          <version>          <desc>
 *    T          2023/8/1 16:31         1.0            统一的异常处理
 */
package t.microservices.fw.common.exception;

import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import t.microservices.fw.common.interResult.R;

import java.net.BindException;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 〈一句话功能简述〉<br> 
 * 〈统一的异常处理〉
 *
 * @author Administrator
 * @create 2023/8/1 16:31
 * @since 1.0.0
 */
@ControllerAdvice
@RestController
public class GlobalExceptionHandler {
//    @ExceptionHandler(Throwable.class)
//    public R exchandler(){
//        return R.fail();
//    }


    /**
     * @Description  表单验证不成功返回异常结果
     * @Author T
     * @Date
     * @Param BindException exception 异常信息
     * @return
     **/
    @ExceptionHandler(BindException.class)
    public R bindExcHandler(BindException exception){
        String message = exception.getMessage();
        return R.fail(message);
    }

    /**
     * @Description  MethodArgumentNotValidException 请求体参数校验不成功返回结果
     * @Author T
     * @Date
     * @Param MethodArgumentNotValidException exception 异常信息
     * @return
    **/
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public R methodArgumentNotValidExcHandler(MethodArgumentNotValidException exception){
        //       把校验异常报的错误转换成map
        Set<String> errors = exception.getBindingResult().getAllErrors().stream()
                .map(ObjectError-> ObjectError.getDefaultMessage())
                .collect(Collectors.toSet());
        return R.fail(errors);
    }
}
