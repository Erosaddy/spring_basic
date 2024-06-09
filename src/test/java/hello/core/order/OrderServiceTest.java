package hello.core.order;

import hello.core.AppConfig;
import hello.core.member.*;
import hello.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder() {
        //given
        Member member = new Member(1L, "Godzilla", Grade.VIP);
        memberService.join(member);

        //when
        Order order = orderService.createOrder(member.getId(), "Dongwon Tuna", 3500);

        //then
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(350);
    }
}
