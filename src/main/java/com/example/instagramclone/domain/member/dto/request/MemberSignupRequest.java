package com.example.instagramclone.domain.member.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class MemberSignupRequest {

    private String email;
    private String nickname;
}
