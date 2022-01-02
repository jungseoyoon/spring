package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FIxDiscountPolicy implements DiscountPolicy{
    /**
     *정액 할인
     * */
    private int discountFixAmount = 1000; //1000원 할인
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Grade.VIP){ //enum타입은 == 쓰는게 맞다.
            return discountFixAmount;
        }else{
            return 0;
        }

    }


}
