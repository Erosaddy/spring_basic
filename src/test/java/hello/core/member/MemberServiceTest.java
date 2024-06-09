package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    
    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }
    
    @Test
    void join() {
        //given
        Member user01 = new Member(1L, "user01", Grade.BASIC);

        //when
        memberService.join(user01);
        Member findUser01 = memberService.findMember(1L);

        //then
        Assertions.assertThat(user01).isEqualTo(findUser01);
    }
}
