package com.study.springFramework.library.service;

import com.study.springFramework.application.domain.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.study.springFramework.factory.EntityFactory.createFakeMember;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@DisplayName("회원 비즈니스 로직에 대한 단위테스트")
class MemberServiceTest {
    private MemberService memberService;
    private Member member = createFakeMember();

    @Test
    @DisplayName("회원 생성을 처리한다.")
    void join() {
        // when/then
        assertThat(memberService.join(member)).isEqualTo(member.getId());
    }

    @Test
    @DisplayName("회원 정보 조회를 처리한다.")
    void find() {
        // given
        memberService.join(member);

        // when/then
        assertThat(memberService.find(member.getId())).isEqualTo(member);
    }
}