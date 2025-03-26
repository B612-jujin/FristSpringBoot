package kr.ac.kopo.cjj.fristspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//실행결과가 html인 경우
@Controller
public class Example01Controller {
    @RequestMapping(value = "exam01", method = RequestMethod.GET)
    //전달받을 모델이 필요 없으면 안적는다.
    public String requestMethod() {
        return "viewPage01";
    }

    @RequestMapping(value = "exam03", method = RequestMethod.GET)
    public @ResponseBody String getMessage() {
        return "@RestController getMessage 연습";
            }
}
