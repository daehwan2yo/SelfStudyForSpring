package com.study.springFramework.application;

import com.study.springFramework.domain.Member;

import java.util.Optional;

public interface MemberRepository {
    Long save(Member member);

    Optional<Member> findById(Long id);
}
