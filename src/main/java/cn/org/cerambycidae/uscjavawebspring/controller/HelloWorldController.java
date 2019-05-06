package cn.org.cerambycidae.uscjavawebspring.controller;

import cn.org.cerambycidae.uscjavawebspring.dao.UserRepository;
import cn.org.cerambycidae.uscjavawebspring.db.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author NoBugNoLife
 */
@RestController
public class HelloWorldController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/helloWorld")
    public String helloBoot(){
        return "Hello Boot-JPA";
    }

    @RequestMapping("/sayHello")
    public String sayHello(ModelMap modelMap){
        User user = new User();
        user.setUid(1);
        userRepository.save(user);
        List<User> users = userRepository.findAll();
        modelMap.put("users",users);
        return "helloBoot";
    }
}
