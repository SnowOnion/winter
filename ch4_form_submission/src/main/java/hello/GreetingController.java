package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @RequestMapping(value="/greeting", method=RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @RequestMapping(value="/greeting", method=RequestMethod.POST)
    public String greetingSubmit(Greeting g,@ModelAttribute Greeting ggg, Model model) {
//        model.addAttribute("greeting", ggg);
        model.addAttribute("greeting", g);
//        上面这两种, 都是对的... ThymeLeaf 神奇的参数传递...
        // 连不加@ModelAttribute都可以啊卧槽!! 棒子撸爆了!
        return "result";
    }

}
