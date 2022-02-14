package com.study.springFramework.library.service;

import com.study.springFramework.application.domain.Member;

public interface MemberService {
    Long join(Member member);

    Member find(Long memberId);
}
