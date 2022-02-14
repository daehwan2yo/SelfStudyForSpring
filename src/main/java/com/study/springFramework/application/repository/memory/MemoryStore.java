package com.study.springFramework.application.repository.memory;

import com.study.springFramework.application.domain.Member;

import java.util.HashMap;
import java.util.Map;

public class MemoryStore {
    private static final Map<Long, Member> store = new HashMap<>();

    public static MemoryStore create() {
        return new MemoryStore();
    }

    public void save(Member member) {
    }

    public Member get(Long id) {
        return null;
    }

    public int size() {
        return store.size();
    }
}
