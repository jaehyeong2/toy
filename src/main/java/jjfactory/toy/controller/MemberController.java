package jjfactory.toy.controller;

import jjfactory.toy.model.Member;
import jjfactory.toy.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/signin")
    public String signinForm(){
        return "/user/signin";
    }

    @GetMapping("/signup")
    public String signupForm(){
        return "/user/signup";
    }

    @PostMapping("/signup")
    public String signup(Member member){
        memberService.join(member);
        return "/user/signup";
    }
}
