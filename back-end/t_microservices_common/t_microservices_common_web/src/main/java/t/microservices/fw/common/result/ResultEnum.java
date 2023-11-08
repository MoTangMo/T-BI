package t.microservices.fw.common.result;

import lombok.Getter;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈枚举接口统一返回结果〉
 *
 * @author Administrator
 * @create 2023/8/1 15:56
 * @since 1.0.0
 */
@Getter
public enum ResultEnum implements Serializable {

    SUCCESS(200,"请求成功"),
    FAIL(50000,"请求失败");


    private  Integer code;

    private String message;

    ResultEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }


}
