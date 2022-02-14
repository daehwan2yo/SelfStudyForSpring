package com.study.springFramework.library.repository;

import com.study.springFramework.application.domain.Member;

import java.util.Optional;

public interface MemberRepository {
    Long save(Member member);

    Optional<Member> findById(Long id);
}
