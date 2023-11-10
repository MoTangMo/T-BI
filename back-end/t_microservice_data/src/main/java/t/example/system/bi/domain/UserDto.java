/**
 * FileName: UserDto
 * Author:   Administrator
 * Date:     11/10/2023 12:48 PM
 * Description: 登录用户实体类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package t.example.system.bi.domain;

import lombok.Data;

/**
 * 〈一句话功能简述〉<br> 
 * 〈登录用户实体类〉
 *
 * @author Administrator
 * @create 11/10/2023 12:48 PM
 * @since 1.0.0
 */
@Data
public class UserDto {

    private String username;

    private String password;

}
