package com.study.springFramework.library.service;

import com.study.springFramework.application.domain.Member;

public interface MemberService {
    Long join(Long memberId);

    Member find(Long memberId);
}
