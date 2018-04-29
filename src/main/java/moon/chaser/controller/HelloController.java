package moon.chaser.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Allen on 2018/4/28.
 */
@RestController
public class HelloController {
    @RequestMapping(value="/")
    public String index(String username, String password){
        return "hello," + username + password;
    }
}