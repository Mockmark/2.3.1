package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
//    UserService userService;
//
//    @Autowired
//    UserController(UserService userService) {
//        this.userService = userService;
//    }

//    @GetMapping(value = "/index")
//    public String printUsers(Model model) {
//        return "index";
//    }

//    @PostMapping(value = "/add")
//    public String addUser(@RequestParam("name") String name,
//                          @RequestParam("email") String email,
//                          @RequestParam("age") int age, Model model) {
//        User user = new User(name, email, age);
//        userService.addUser(user);
//        model.addAttribute("user", user);
//        return "redirect:/index";
//    }

    @GetMapping(value = "/index")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "index";
    }
}
