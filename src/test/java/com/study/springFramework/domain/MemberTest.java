package com.study.springFramework.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("회원 도메인에 대한 단위 테스트")
public class MemberTest {

    @Test
    @DisplayName("회원을 생성한다.")
    void Member_생성() {
        // when
        Member member = new Member("홍길동");

        // then
        assertThat(member.getName()).isEqualTo("홍길동");
    }

}