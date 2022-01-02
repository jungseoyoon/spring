package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FIxDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FIxDiscountPolicy();
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice); //난 몰라 discountpolicy 너가 결과만 던져줘
        //단일체계원칙 잘지킴 ㅋ

        return new Order(memberId,itemName,itemPrice,discountPrice);
        //반환해주면 오더서비스의 역할 끝.
    }
}
