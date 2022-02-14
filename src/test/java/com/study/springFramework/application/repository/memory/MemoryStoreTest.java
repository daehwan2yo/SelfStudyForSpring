package com.study.springFramework.application.repository.memory;

import com.study.springFramework.application.domain.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.study.springFramework.factory.EntityFactory.createFakeMember;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("memory 저장소 단위테스트")
class MemoryStoreTest {
    private MemoryStore memoryStore = MemoryStore.create();
    private Member member = createFakeMember();

    @BeforeEach
    void init() {
        memoryStore.clear();
    }

    @Test
    @DisplayName("회원을 Memory 에 저장한다.")
    void save() {
        // when
        memoryStore.save(member);

        // then
        assertThat(memoryStore.size()).isEqualTo(1);
    }

    @Test
    @DisplayName("id를 통해 회원을 Memory로 부터 조회한다.")
    void get() {
        // given
        memoryStore.save(member);

        // when/then
        assertThat(memoryStore.get(1L)).isEqualTo(member);
    }
}