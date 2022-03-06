package com.study.springFramework.factory;

import com.study.springFramework.application.ui.dto.MemberRequest;

public class RequestFactory {
    public static MemberRequest 회원_가입_body_생성(String memberName) {
        return MemberRequest.from(memberName);
    }
}
