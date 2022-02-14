package com.study.springFramework.application.repository.memory;

import com.study.springFramework.application.domain.Member;

import java.util.HashMap;
import java.util.Map;

public class MemoryStore {
    private static final Map<Long, Member> store = new HashMap<>();
    private static long PK = 1;

    public static MemoryStore create() {
        return new MemoryStore();
    }

    public void save(Member member) {
        store.put(PK++, member);
    }

    public Member get(Long id) {
        return store.get(id);
    }

    public int size() {
        return store.size();
    }

    public void clear() {
        store.clear();
        PK = 1;
    }
}
