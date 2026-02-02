package com.example.instagramclone.controller.rest;


import com.example.instagramclone.domain.member.dto.request.MemberSignupRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/api/members")
public class MemberController {

    @GetMapping("/hello")
//    @RequestMapping(value="/hello", method = RequestMethod.GET)
//    @ResponseBody
    public List<String> foo() {
        return List.of("짜장", "짱뽕", "탕수육");
    }

    @PostMapping("/bye")
//    @RequestMapping(value="/bye", method = RequestMethod.POST)
//    @ResponseBody
    public List<String> bar() {
        return List.of("잘가", "세요");
    }

    @RequestMapping(value = "/modify", method = {RequestMethod.PUT, RequestMethod.PATCH})
    public void foo2() {

    }

    @GetMapping("/{id}")
    public String getMemberProfile(@PathVariable Long id) {
        // @PathVariable이 주소창의 {id} 값을 낚채서 변수 id에 담아줍니다.
        return "요청하신 " + id + "번 회원의 프로필을 조회 중입니다...";
    }

    @GetMapping("/search")
    public String searchMember(String name,
                               @RequestParam(required = false, defaultValue = "10") int age) {
        // @RequestParam이 주소창의 ?name= 뒤에 있는 값을 name 변수에 담아줍니다.
        return name + "이라는 이름을 가진 회원들을 검색 중입니다..." + age + "세이시군요!";
    }

    @PostMapping("/signup")
    public String signup(@RequestBody MemberSignupRequest request) {
        // @RequestBody가 JSON '본문'을 자바 객체(Request DTO)로 변환해줍니다.
        System.out.println("가입 요청 이메일: " + request.getEmail());
        return request.getNickname() + "님, 가입 신청이 완료되었습니다!";
    }

}
