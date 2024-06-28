package org.orak.firstweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")

public class TestController {
    @GetMapping("/hello")
    public User hello(){
        User user =new User();
        user.userName="nurullah.orak";
        user.fullName="Nurullah Orak";
        user.userId=1;
        user.weight=75;
        return user;
    }

    @GetMapping("/hello2/{userName}")
    public User hello2(@PathVariable(name="userName")String userName){
        User user=new User();
        user.userName=userName;
        user.fullName="Nurullah Orak";
        user.userId=1;
        user.weight=75;
        return user;
    }
}
