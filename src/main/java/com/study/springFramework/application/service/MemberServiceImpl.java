package com.study.springFramework.application.service;

import com.study.springFramework.application.domain.Member;
import com.study.springFramework.application.repository.memory.MemoryMemberRepository;
import com.study.springFramework.library.repository.MemberRepository;
import com.study.springFramework.library.service.MemberService;

public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public Long join(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public Member find(Long memberId) {
        return memberRepository.findById(memberId).orElseThrow(IllegalArgumentException::new);
    }
}
