package com.example.instagramclone.controller.rest;

import com.example.instagramclone.domain.post.dto.response.PostResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @GetMapping("/foods")
    public String[] foods() {
        return new String[] {"오렌지", "족발", "띠드버거"};
    }

    @GetMapping("/hobbies")
    public List<String> hobbies() {
        return List.of("축구", "배구", "음악감상", "낮잠");
    }

    @GetMapping("/introduce")
    public Map<String, Object> introduce() {
        return Map.of(
                "name", "superstar",
                "age", 30,
                "is_good", true,
                "hobbies", List.of("놀기", "멍때리기")
        );
    }

    @GetMapping
    public PostResponse findOne() {
//        return new PostResponse(10L, "ddddd", 888);
        return PostResponse.builder()
                .id(10L)
                .viewCount(8997)
                .content("아무아무 컨텐츠 없음~~ 흐흐흐")
                .build();
    }


}
