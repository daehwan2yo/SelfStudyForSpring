package com.study.springFramework.application;

import com.study.springFramework.application.domain.Member;
import com.study.springFramework.application.repository.memory.MemoryMemberRepository;
import com.study.springFramework.library.repository.MemberRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.study.springFramework.factory.EntityFactory.createFakeMember;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("회원 저장소 IO 에 대한 단위 테스트")
public class MemberRepositoryTest {
    private MemberRepository memberRepository = new MemoryMemberRepository();
    private Member member;

    @BeforeEach
    void init() {
        member = createFakeMember();
    }

    @Test
    @DisplayName("회원을 저장한다.")
    void save() {
        // when/then
        assertThat(memberRepository.save(member)).isEqualTo(1L);
    }

    @Test
    @DisplayName("회원을 Id 로 조회한다.")
    void findById() {
        // given
        memberRepository.save(member);

        // when/then
        assertThat(memberRepository.findById(1L).orElseThrow(IllegalArgumentException::new)).isEqualTo(member);
    }
}
