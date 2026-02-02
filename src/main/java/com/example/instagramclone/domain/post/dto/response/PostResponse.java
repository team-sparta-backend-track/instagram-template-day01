package com.example.instagramclone.domain.post.dto.response;

import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostResponse {
    // TODO: 필드를 추가해보세요.
    private Long id;
    private String content;
    private int viewCount;
}
