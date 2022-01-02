package hello.core.member;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP); //long이라서 L붙여줘야함;;
        memberService.join(member);
        //IDX를 키로, 멤버 객체를 벨류로 넣은거임.
        Member findMember = memberService.findMember(1L); //멤버 찾는거
        System.out.println("findMember = " + findMember.getName()); // soutv치고 앤터하고 변수 택하면 print 자동으로만들어짐;
        System.out.println("new member= " + member.getName());
        //이렇게 하고나서 테스트는 여기서 말고 test쪽으로 가서 해야한다고 test코드로 옮겨서 다시 테스트함.
    }
}
