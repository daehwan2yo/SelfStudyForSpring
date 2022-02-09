package com.study.springFramework.application;

import com.study.springFramework.domain.Member;

public interface MemberRepository {
    Long save(Member member);
}
