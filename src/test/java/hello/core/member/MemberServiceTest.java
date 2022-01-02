package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();
    @Test
    void join(){
        //given
        Member member = new Member(1L,"memberA",Grade.VIP);
        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L); //findMember라는 변수명으로 1을 키로 하는 벨류를 가져오는데
        //그 벨류는 객체다. 객체가 Member 형태로 받아온다?ㅋㅋ
        System.out.println(member.getGrade());
        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
