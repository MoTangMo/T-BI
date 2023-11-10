/**
 * FileName: AuthController
 * Author:   Administrator
 * Date:     11/10/2023 12:47 PM
 * Description: 简易的登录系统
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package t.example.system.bi.controller;

import cn.hutool.jwt.JWTUtil;
import org.springframework.web.bind.annotation.*;
import t.example.system.bi.domain.UserDto;
import t.microservices.fw.common.interResult.R;
import t.microservices.fw.common.result.ResultEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈简易的登录系统〉
 *
 * @author Administrator
 * @create 11/10/2023 12:47 PM
 * @since 1.0.0
 */
@RestController
@RequestMapping("system")
public class AuthController {

    @PostMapping("easyLogin")
    public R easyLogin(@RequestBody UserDto userDto){
        if (userDto.getUsername()!=null && userDto.equals("user")){
            if (userDto.getPassword() != null && userDto.getPassword().equals("12345")){
                Map<String, Object> map = new HashMap<String, Object>() {
                    private static final long serialVersionUID = 1L;
                    {
                        put("uid", Integer.parseInt("123"));
                        put("expire_time", System.currentTimeMillis() + 1000 * 60 * 60 * 24 * 15);
                    }
                };
                String token = JWTUtil.createToken(map, "1234".getBytes());
                return R.success(token);
            }else{
                return R.fail(ResultEnum.ERROR_PASSWORD);
            }
        }else {
            return R.fail(ResultEnum.ERROR_USERNAME);
        }
    }



}
