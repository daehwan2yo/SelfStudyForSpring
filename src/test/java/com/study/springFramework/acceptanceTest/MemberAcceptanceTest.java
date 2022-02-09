package com.study.springFramework.acceptanceTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Feature      : 회원 정보를 관리한다.
 */
@DisplayName("회원 관리 기능 인수테스트")
public class MemberAcceptanceTest extends AcceptanceTest {

    /**
     *  Scenario    : 회원 가입을 요청하면, 회원이 생성된다.
     *  When        : 회원 가입을 요청하면,
     *  Then        : 회원이 생성된다.
     */
    @Test
    @DisplayName("회원 가입을 요청하면 회원이 생성된다.")
    public void 회원가입() {

    }

    /**
     * Scenario    : 회원 정보 조회를 요청하면, 알맞는 회원의 정보를 응답한다.
     * Given       : 회원이 한명 생성되었을때
     * When        : 해당 회원의 정보 조회를 요청하게 되면,
     * Then        : 회원의 정보를 응답한다.
     */
    @Test
    @DisplayName("회원 조회를 하면 회원의 정보가 조회된다.")
    public void 회원_정보_조회() {

    }
}
