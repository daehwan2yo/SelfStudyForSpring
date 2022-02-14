package com.study.springFramework.application.repository.memory;

import com.study.springFramework.application.domain.Member;
import com.study.springFramework.library.repository.MemberRepository;

import java.util.Optional;

public class MemoryMemberRepository implements MemberRepository {
    private static MemoryStore memoryStore = MemoryStore.create();

    @Override
    public Long save(Member member) {
        memoryStore.save(member);
        return member.getId();
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(memoryStore.get(id));
    }
}
