package kr.hs.study.GetParameter2.controller;

import kr.hs.study.GetParameter2.dto.signup;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;

@Controller
public class testController {
//    //HttpServletRequest
//    @PostMapping("/signup")
//    public String test2(HttpServletRequest hp){
//        String id = hp.getParameter("id");
//        String password = hp.getParameter("pass");
//        String name = hp.getParameter("name");
//        String email = hp.getParameter("email");
//        String tel = hp.getParameter("tel");
//        String local = hp.getParameter("local");
//
//        return "result";
//    }

//    //WebRequest
//    @PostMapping("signup")
//    public String test3(WebRequest wr){
//        String id = wr.getParameter("id");
//        String password = wr.getParameter("pass");
//        String name = wr.getParameter("name");
//        String email = wr.getParameter("email");
//        String tel = wr.getParameter("tel");
//        String local = wr.getParameter("local");
//
//        System.out.println("id : "+id);
//        System.out.println("password : "+password);
//        System.out.println("name : "+name);
//        System.out.println("email : "+email);
//        System.out.println("tel : "+tel);
//        System.out.println("local : "+local);
//
//
//        return "result";
//    }

//    // RequestParam
//    @PostMapping("signup")
//    public String test4(@RequestParam("id") String id,
//                          @RequestParam("pass") String password,
//                          @RequestParam("name") String name,
//                          @RequestParam("email") String email,
//                          @RequestParam("tel") String tel,
//                          @RequestParam("local") String local){
//
//        System.out.println("id : "+id);
//        System.out.println("password : "+password);
//        System.out.println("name : "+name);
//        System.out.println("email : "+email);
//        System.out.println("tel : "+tel);
//        System.out.println("local : "+local);
//
//        return "result";
//    }

//    //5. ModelAttribute
    @PostMapping("signup")
    public String test(@ModelAttribute signup dto){
        System.out.println("id : "+dto.getId());
        System.out.println("password : "+dto.getPass());
        System.out.println("name : "+dto.getName());
        System.out.println("email : "+dto.getEmail());
        System.out.println("tel : "+dto.getTel());
        System.out.println("local : "+dto.getLocal());

        return "result";
    }
}
