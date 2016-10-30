package timetable;

/**
 * Created by Administrator on 2016/10/30.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserDao userMapper;


    //判断登陆密码是否正确
    @RequestMapping(value="/check_user")
    public int check_user(@RequestParam(value="name")String name,@RequestParam(value="password")String password)
    {
        User user=userMapper.findByName(name);
        if(user==null)
            return 0;
        if(user.getPassword().equals(password))
            return 1;
        else
            return 0;  //0表示用户名或密码错误，1表示验证成功


    }

}
