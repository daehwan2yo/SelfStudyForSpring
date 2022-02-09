package com.study.springFramework.application;

import com.study.springFramework.domain.Grade;
import com.study.springFramework.domain.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("회원 저장소 IO 에 대한 단위 테스트")
public class MemberRepositoryTest {
    private MemberRepository memberRepository;
    private Member member;

    @BeforeEach
    void init() {
        member = new Member(1L, "홍길동", Grade.BASIC);
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
        // when/then
        assertThat(memberRepository.findById(1L).orElseThrow(IllegalArgumentException::new));
    }
}
