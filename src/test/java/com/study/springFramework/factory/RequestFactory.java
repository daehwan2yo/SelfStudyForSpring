package com.study.springFramework.factory;

import com.study.springFramework.application.ui.dto.MemberRequest;

public class RequestFactory {
    public static MemberRequest createMember(String memberName) {
        return MemberRequest.from(memberName);
    }
}
