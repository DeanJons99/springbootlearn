package learn.web.controller;

import learn.web.entity.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/webmvc")
public class WebApi {

    @ResponseBody
    @GetMapping("add")
    public Result sumAPI(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        return new Result("加法", 20001, a + b);
    }

    @ResponseBody
    @GetMapping("echo")
    public String echoMsg(@RequestParam("msg") String msg) {
        return msg;
    }

}
