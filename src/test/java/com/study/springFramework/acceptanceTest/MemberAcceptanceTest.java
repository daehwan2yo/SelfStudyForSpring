package com.study.springFramework.acceptanceTest;

import com.study.springFramework.application.ui.dto.MemberRequest;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.study.springFramework.acceptanceTest.Steps.MemberSteps.*;
import static com.study.springFramework.factory.RequestFactory.*;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Feature      : 회원 정보를 관리한다.
 */
@DisplayName("회원 관리 기능 인수테스트")
public class MemberAcceptanceTest extends AcceptanceTest {
    private static final String MEMBER_NAME = "FakeMember";

    /**
     * Scenario     : 회원 가입을 요청하면, 회원이 생성된다.
     * Given        : 생성할 회원의 정보가 준비되고
     * When         : 회원 가입을 요청하면,
     * Then         : 회원이 생성된다.
     */
    @Test
    @DisplayName("회원 가입을 요청하면 BASIC 등급의 회원이 생성된다.")
    void 회원가입() {
        // given
        MemberRequest 회원_가입_요청_body = 회원_가입_body_생성(MEMBER_NAME);

        // when
        ExtractableResponse<Response> 가입_응답 = 가입_요청(회원_가입_요청_body);

        // then
        assertThat(가입_응답.statusCode()).isEqualTo(HttpStatus.SC_CREATED);
        assertThat(가입_응답.header("Location")).isEqualTo("/members/" + 1L);
    }

    /**
     * Scenario    : 회원 정보 조회를 요청하면, 알맞는 회원의 정보를 응답한다.
     * Given       : 회원이 한명 생성되었을때
     * When        : 해당 회원의 정보 조회를 요청하게 되면,
     * Then        : 회원의 정보를 응답한다.
     */
    @Test
    @DisplayName("회원 조회를 하면 회원의 정보가 조회된다.")
    void 회원_정보_조회() {

    }

    /**
     * Scenario    : BASIC 회원의 등급에 대해 VIP 로 변경 요청을 하면 등급이 변경된다.
     * Given       : BASIC 등급의 회원이 생성되었을때
     * When        : 해당 회원에 대해 등급 상향 요청을 하면,
     * Then        : 회원의 등급이 VIP 로 상향된다.
     */
    @Test
    @DisplayName("BASIC 회원의 등급을 VIP 로 변경해준다.")
    void 회원_등급_상향() {

    }

    /**
     * Scenario     : VIP 회원의 등급에 대해 BASIC 으로 변경 요청을 하면 등급이 변경된다.
     * Given        : BASIC 등급의 회원이 생성되었을때
     * Given        : 등급을 VIP 로 상향을 시키고
     * When         : 다시 해당 회원의 등급을 BASIC 으로 하향 요청을 한다면,
     * Then         : 회원의 등급이 BASIC 이 된다.
     */
    @Test
    @DisplayName("VIP 회원의 등급을 BASIC 으로 변경해준다.")
    void 회원_등급_하향() {

    }
}
